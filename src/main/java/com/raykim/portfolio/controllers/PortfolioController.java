package com.raykim.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
	}
	@RequestMapping("/me")
	public String me() {
		return "forward:/about_me.html";
	}
	@RequestMapping("/projects")
	public String projects() {
		return "forward:/my_projects.html";
	}
}
