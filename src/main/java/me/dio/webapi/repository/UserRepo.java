package me.dio.webapi.repository;

import me.dio.webapi.handler.BusinessException;
import me.dio.webapi.handler.RequiredFieldException;
import me.dio.webapi.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {

	private void validateUser(User user) {
		if(user.getLogin() == null)
			throw new RequiredFieldException("login");
		if(user.getPassword() == null)
			throw new RequiredFieldException("password");
	}

	public void save(User user) {
		validateUser(user);
		System.out.println("SAVE - Receiving user at the repository layer");
		System.out.println(user);
	}

	public void update(User user) {
		validateUser(user);
		System.out.println("UPDATE - Receiving user at the repository layer");
		System.out.println(user);
	}

	public void remove(Integer id) {
		System.out.printf("DELETE/id - Receiving user with id %d at the repository layer", id);
		System.out.println(id);
	}
	public List<User> listAll() {
		System.out.println("LIST - Listing system users...");
		List<User> users = new ArrayList<>();
		long i = 1;
		users.add(new User(i++, "layin","koinu"));
		users.add(new User(i++,"darklayin","kuraikoneko"));
		users.add(new User(i,"aliny","kawaiisugiteatsukaenai"));
		return users;
	}
	public User finById(Integer id) {
		System.out.printf("FIND/id - Receiving id %d to locate the user", id);
		return new User("layin","koinu");
	}

	public User finByUsername(String username) {
		System.out.printf("FIND/username - Receiving username %s to locate the user", username);
		return new User("layin","koinu");
	}

}
