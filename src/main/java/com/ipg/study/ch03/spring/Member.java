package com.ipg.study.ch03.spring;

import java.time.LocalDateTime;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	public Member(String email, String password, String name, LocalDateTime registerDateTime) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void changePassword(String oldPassword,
			String newPassword) {
		if(!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

}
