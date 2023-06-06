package com.example.SpringBootCrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/marriage")
public class MarriageController {

	@GetMapping("/message")
	public String getMessage() {
		return "Happy Married life";
	}
}
