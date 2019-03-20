package ma.gov.gbank.dao;

import java.sql.SQLException;

import ma.gov.gbank.entities.User;

public interface UserDao {
	boolean addUser(User user) throws SQLException;
	User selectByUsername(User user);
}
