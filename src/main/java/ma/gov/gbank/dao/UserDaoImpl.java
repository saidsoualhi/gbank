package ma.gov.gbank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.gov.gbank.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("BanqueU");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public User selectByUsername(User user) {
		Query q=em.createQuery("from User u where email = :e");
		q.setParameter("e", user.getEmail());
		
		List<User> users = q.getResultList();
		if (users != null && users.size() != 0)
			return (User) q.getResultList().get(0);
		else
			return null;
	}


}
