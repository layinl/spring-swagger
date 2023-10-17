package me.dio.webapi.controller;

import me.dio.webapi.model.User;
import me.dio.webapi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepo.listAll();
	}

	@GetMapping("users/{username}")
	public User getUser(@PathVariable("username") String username) {
		return userRepo.finByUsername(username);
	}

	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userRepo.remove(id);
	}

	@PostMapping("/users")
	public void postUser(@RequestBody User user) {
		userRepo.save(user);
	}

}
