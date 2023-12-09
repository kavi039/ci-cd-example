package com.kavita.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiCdApplication {

	@GetMapping(value = "/fetch-name")
	public String fetchName(@RequestParam String nickName){
		return "name "+nickName;
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCiCdApplication.class, args);
	}

}
