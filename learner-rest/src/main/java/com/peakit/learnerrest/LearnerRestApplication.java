package com.peakit.learnerrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LearnerRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnerRestApplication.class, args);
	}

	@RequestMapping(value = "/available")
	public String available() {
		return "available";
	}

	@RequestMapping(value = "/checkedOut")
	public String checkedOut() {
		return "checked-out";
	}

}
