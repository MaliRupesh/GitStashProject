package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping
	public String welcome() {
		String msg="Controller added successful";
		return msg;
		
	}
	
	
}
