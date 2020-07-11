package com.vastika.smd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.model.College;
import com.vastika.smd.service.CollegeService;


@Controller
public class ResetController {
	private final CollegeService collegeService;
	
	public ResetController(CollegeService collegeService) {
		this.collegeService=collegeService;
	}
	
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String getResetForm() {
		return "reset";
		
	}

	@PostMapping("/reset_password")
	public String updateCollegePassword(@RequestParam String passWord, @RequestParam String newPassword, HttpSession session,
			Model model) {
		
		College college= collegeService.getCollegeInfoById((Integer)session.getAttribute("id"));
		
		if (college.getPassWord().equals(passWord)) {
			college.setPassWord(newPassword);
			collegeService.updateCollegeInfo(college);
			return "redirect:/list_college";
			}
		
			model.addAttribute("message", "Old password doesnot match !!!");
			return "reset";
	}
	
		
}

