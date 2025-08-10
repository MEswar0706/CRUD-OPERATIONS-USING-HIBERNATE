package com.hibernate.Entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	@Column(name="name",length=30,nullable=false)
	private String name;
	@Column(name="username",length=30,nullable=false,unique=true)
	private String username;
	@Column(name="password",length=30,nullable=false)
	private String password;
	@Column(name="email",length=30,nullable=false,unique=true)
	private String email;
	@Column(name="phone",length=14)
	private String phone;
	@Column(name="address",length=30)
	private String address;  
	@Column(name="role")
	@Enumerated(EnumType.STRING)
	private Role role;
	@Column(name="created_date")
	@CreationTimestamp
	private Timestamp created_date;
	
	public User() {
		super();
	}

	public User(int user_id, String name, String username, String password, String email, String phone, String address,
			Role role, Timestamp created_date) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.created_date = created_date;
	}

	public User(String name, String username, String password, String email, String phone, String address, Role role) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + ", role=" + role
				+ ", created_date=" + created_date + "]";
	}

	
	
}
