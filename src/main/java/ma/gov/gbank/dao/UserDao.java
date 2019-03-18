package ma.gov.gbank.dao;

import ma.gov.gbank.entities.User;

public interface UserDao {
	User selectByUsername(User user);
}
