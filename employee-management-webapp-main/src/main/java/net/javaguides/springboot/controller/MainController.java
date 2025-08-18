package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class MainController {
	public static final Logger logger = LogManager.getLogger(MainController.class);
	@GetMapping("/login")

	public String login(){

		logger.info("Login..");
		//return "redirect:/";
		return "login";

	}

	/* @GetMapping("/hi") public String home() { return "index"; }*/

}
