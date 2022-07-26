package com.example.pictgram.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

@Controller
public class SessionsController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/login")
	public String index() {
		return "sessions/new";
	}

	@GetMapping(path = "/login-failure")
	public String loginFailure(Model model, Locale locale) {
		model.addAttribute("hasMessage", true);
		model.addAttribute("class", "alert-danger");
		model.addAttribute("message", messageSource.getMessage("sessions.loginFailure.flash", new String[] {}, locale));

		return "sessions/new";
	}

	@GetMapping(path = "/logout-complete")
	public String logoutComplete(Model model, Locale locale) {
		model.addAttribute("hasMessage", true);
		model.addAttribute("class", "alert-info");
		model.addAttribute("message", messageSource.getMessage("sessions.logoutComplete.flash", new String[] {}, locale));
		return "layouts/complete";
	}
}