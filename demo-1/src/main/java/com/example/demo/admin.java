package com.example.demo;


import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class admin {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;
	private String username;
	private String fullname;
	private String email;
	private int contact;
	private String password;
	private int admin_group_id;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public Long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAdmin_group_id() {
		return admin_group_id;
	}
	public void setAdmin_group_id(int admin_group_id) {
		this.admin_group_id = admin_group_id;
	}
	
     
}
