package ma.gov.gbank.dao;

import java.sql.SQLException;
import java.util.List;

import ma.gov.gbank.entities.Compte;

public interface IDao {
	boolean insert(Compte c) throws SQLException;

	boolean update(Compte c) throws SQLException;

	boolean delete(Compte c) throws SQLException;

	List<Compte> selectAll();
	List<Compte> selectAllByUserId(Long id);
	Compte selectById(Long id);
}
