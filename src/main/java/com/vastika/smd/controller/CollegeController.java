package com.vastika.smd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollegeController {
	
	@RequestMapping(value="/collegePage")
	public String getHomePage() {
		return "collegePage";
		
	}

}
