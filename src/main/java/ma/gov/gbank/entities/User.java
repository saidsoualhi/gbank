package ma.gov.gbank.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ma.gov.gbank.controller.EmailValidator;

@Entity
@Table(name="tuser")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 343064508484226593L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	@EmailValidator
	private String email;
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private Collection<Compte> listCompte;
	  
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public Collection<Compte> getListCompte() {
		return listCompte;
	}
	public void setListCompte(Collection<Compte> listCompte) {
		this.listCompte = listCompte;
	}
}
