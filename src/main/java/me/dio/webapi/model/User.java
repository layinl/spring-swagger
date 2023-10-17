package me.dio.webapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class User {

	private static Long count = 1L;

	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String login;
	@Getter
	@Setter
	private String password;

	public User() {
	}

	public User(String login, String password) {
		this.id = count++;
		this.login = login;
		this.password = password;
	}

	public User(Long id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", login='" + login + '\'' + ", password='" + password + '\'' + '}';
	}
}
