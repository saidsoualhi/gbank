package ma.gov.gbank.services;

import java.util.List;

import ma.gov.gbank.entities.User;

public interface UserService {
	boolean addUser(User user);
	public User getUser(User user);
	public User selectByEmail(User user);
	public List<User> selectAll();
}
