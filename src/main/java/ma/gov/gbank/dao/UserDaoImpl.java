package ma.gov.gbank.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.gov.gbank.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("BanqueU");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public User userConnexion(User user) {
		Query q = em.createQuery("from User u where email = :e and password  = :p");
		q.setParameter("e", user.getEmail());
		q.setParameter("p", user.getPassword());
		
		List<User> users = q.getResultList();
		if (users != null && users.size() != 0)
			return (User) q.getResultList().get(0);
		else
			return null;
	}

	@Override
	public User selectByEmail(User user) {
		Query q = em.createQuery("from User u where email = :e");
		q.setParameter("e", user.getEmail());
		List<User> users = q.getResultList();
		if (users != null && users.size() != 0)
			return (User) q.getResultList().get(0);
		else
			return null;
	}

	@Override
	public boolean addUser(User user) throws SQLException {
		EntityTransaction tx= null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(user);
			tx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public List<User> selectAll() {
		Query q=em.createQuery("from User u");
		return q.getResultList();
	}


}
