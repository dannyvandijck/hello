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
	public String createNewOrder() {
		return "HELLO WORLD";
	}

}
