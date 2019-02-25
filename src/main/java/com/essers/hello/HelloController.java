package com.essers.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	@ResponseStatus(HttpStatus.ACCEPTED)
	@ResponseBody()
	public String sayHello() {
		return "HELLO WORLD 1 ";
	}

	@GetMapping("/hello2")
	@ResponseStatus(HttpStatus.ACCEPTED)
	@ResponseBody()
	public String sayHello2() {
		return "HELLO WORLD 2 a second time !!! ";
	}

}
