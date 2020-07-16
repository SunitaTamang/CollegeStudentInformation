package com.vastika.smd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.model.College;
import com.vastika.smd.model.Student;
import com.vastika.smd.service.CollegeService;
import com.vastika.smd.service.StudentService;


@Controller
public class ResetController {
	private final CollegeService collegeService;
	
	private final StudentService studentService;
	
	public ResetController(CollegeService collegeService, StudentService studentService) {
		this.collegeService=collegeService;
		this.studentService=studentService;
	}
	
	@GetMapping( "/cReset" )
	public String getCollegeResetForm() {
		return "cReset";
		
	}
	
	@GetMapping( "/studentReset" )
	public String getStudentResetForm() {
		return "studentReset";
		
	}


	@PostMapping("/reset_college_password")
	public String updateCollegePassword(@RequestParam String passWord, @RequestParam String newPassword, HttpSession session,
			Model model) {
		
		College college= collegeService.getCollegeInfoById((Integer)session.getAttribute("id"));
		
		if (college.getPassWord().equals(passWord)) {
			college.setPassWord(newPassword);
			collegeService.updateCollegeInfo(college);
			return "redirect:/list_college";
			}
		
			model.addAttribute("message", "Old password doesnot match !!!");
			return "cReset";
	}
	
	@PostMapping("/reset_student_password")
	public String updateStudentPassword(@RequestParam String spassWord, @RequestParam String newPassword, HttpSession session,
			Model model) {
		
		Student student= studentService.getStudentInfoById((Integer)session.getAttribute("id"));
		
		if (student.getSpassWord().equals(spassWord)) {
			student.setSpassWord(newPassword);
			studentService.updateStudentInfo(student);
			return "redirect:/list_student";
			}
		
			model.addAttribute("message", "Old password doesnot match !!!");
			return "studentReset";
	}
		
}

