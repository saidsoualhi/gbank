package ma.gov.gbank.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.gbank.dao.UserDao;
import ma.gov.gbank.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public User getUser(User user) {
		user = userDao.selectByUsername(user);
		return user;
	}

	@Override
	public boolean addUser(User user) {
		try {
			return userDao.addUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
