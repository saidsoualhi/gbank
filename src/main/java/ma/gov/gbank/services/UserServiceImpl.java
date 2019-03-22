package ma.gov.gbank.services;

import java.sql.SQLException;
import java.util.List;

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
		user = userDao.userConnexion(user);
		return user;
	}
	
	@Override
	public User selectByEmail(User user) {
		user = userDao.selectByEmail(user);
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

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}
}
