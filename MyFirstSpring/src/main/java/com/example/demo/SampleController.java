package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/get")
	public String sample() {
		return "初めてのSpring\n豊かなうまみとかろやかな後味\n綾鷹";
	}

	@GetMapping("/get2")
	public String sample1() {
		return "初めてのSpring\n豊かなうまみとかろやかな後味\n綾鷹2";
	}

	@GetMapping("/hw")
	public String hw() {
		return "Hello World!!";
	}
}
