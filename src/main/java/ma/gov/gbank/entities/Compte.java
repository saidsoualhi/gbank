package ma.gov.gbank.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TCOMPTE")
public class Compte implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -5854414574024025978L;
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String num;
	private String description;
	private String capital;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="code_user")
	private User user; 
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Compte(String num, String description, String capital) {
		super();
		this.num = num;
		this.description = description;
		this.capital = capital;
	}
	public Compte(String num, String description) {
		super();
		this.num = num;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Compte [num=" + num + ", description=" + description + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}
