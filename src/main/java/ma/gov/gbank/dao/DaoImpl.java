package ma.gov.gbank.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.gov.gbank.entities.Compte;

@Repository
public class DaoImpl implements IDao {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("BanqueU");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean insert(Compte c) throws SQLException {
		EntityTransaction tx= null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(c);
			tx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean update(Compte c) throws SQLException {
		EntityTransaction tx= null;
		try {
			tx=em.getTransaction();
			tx.begin();
			
			Compte c1 = (Compte)em.find(Compte.class, c.getId());
			
			c1.setDescription(c.getDescription());
			c1.setNum(c.getNum());
			
			tx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean delete(Compte c)  throws SQLException {
		EntityTransaction tx= null;
		try {
			tx=em.getTransaction();
			tx.begin();
			Compte c1 = (Compte)em.find(Compte.class, c.getId());
			em.remove(c1);
			tx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public List<Compte> selectAll() {
		Query q=em.createQuery("from Compte c");
		return q.getResultList();
	}

	@Override
	public Compte selectById(Long id) {
		Compte c = em.find(Compte.class, id);
		if (c == null) {
            System.out.println("Can't find Artist for ID " + id);
        }
        return c;
	}
	
}
