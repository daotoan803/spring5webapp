package guru.springframework.spring5webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hey")
	public String hello() {
		return "Hello !";
	}

}
