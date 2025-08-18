package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.dto.UserRegistrationDto;
import net.javaguides.springboot.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	public static final Logger logger = LogManager.getLogger(UserRegistrationController.class);
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("users")
    public UserRegistrationDto userRegistrationDto() {
		logger.info("users registration");return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		logger.info("showRegistrationForm");return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("users") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		logger.info("registerUserAccount");
		return "redirect:/registration?success";
	}
}
