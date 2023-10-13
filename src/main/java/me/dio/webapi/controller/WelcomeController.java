package me.dio.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "<h1 style=\"color: #51007f\">Welcome! If you're seeing this, the API is working just fine :)</h1>";
	}

}
