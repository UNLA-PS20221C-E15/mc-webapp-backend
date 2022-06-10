package unlaps20221ce15.mcdonalsapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "dni", unique = true, length = 10)
	private int document;

	@Column(name = "email", unique = true, length = 45)
	private String email;

	@Column(name = "username", unique = true, length = 45)
	private String username;

	@Column(name = "password", unique = true, length = 100)
	private String password;

	private String roleName;

	public Usuario() {}

	public Usuario(int id, String name, String lastname, int document, String email, String username, String password, String roleName) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.document = document;
		this.email = email;
		this.username = username;
		this.password = password;
		this.roleName = roleName;
	}

	public Usuario(String name, String lastname, int document, String email, String username, String password, String roleName) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.document = document;
		this.email = email;
		this.username = username;
		this.password = password;
		this.roleName = roleName;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getDocument() {
		return document;
	}

	public void setDocument(int document) {
		this.document = document;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
