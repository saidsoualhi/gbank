package ma.gov.gbank.services;

import ma.gov.gbank.entities.Compte;
import ma.gov.gbank.entities.User;

public interface UserService {
	boolean addUser(User user);
	public User getUser(User user);
}
