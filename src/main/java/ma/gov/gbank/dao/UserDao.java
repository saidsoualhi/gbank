package ma.gov.gbank.dao;

import java.sql.SQLException;
import java.util.List;

import ma.gov.gbank.entities.User;

public interface UserDao {
	boolean addUser(User user) throws SQLException;
	User userConnexion(User user);
	User selectByEmail(User user);
	List<User> selectAll();
}
