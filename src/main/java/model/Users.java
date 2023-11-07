package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUser")
	private Long idUser;
	
	@Column(name="user_name", nullable=false)
	private String user_name;
	
	@Column(name="last_name", nullable=false)
	private String last_name;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="password", nullable=false)
	private String password;
	
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="Users_idUsers", nullable=false)
    private Users users;
	
	
	public Users() {
		super();
	}

	public Users(Long idUser, String user_name, String last_name, String email, String password) {
		super();
		this.idUser = idUser;
		this.user_name = user_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [idUser=" + idUser + ", user_name=" + user_name + ", last_name=" + last_name + ", email=" + email
				+ ", password=" + password + "]";
	}


}
