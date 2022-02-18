package com.dv.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Github actions";
	}

}
