package com.dv.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdActionsGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdActionsGithubApplication.class, args);
	}
	
	public String getMsg() {
	return "welcome to gitrepo";
	}

}
