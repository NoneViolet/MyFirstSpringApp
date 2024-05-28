package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {
	@GetMapping("/get")
	public String sample() {
		return "初めてのSpring";
	}

}
