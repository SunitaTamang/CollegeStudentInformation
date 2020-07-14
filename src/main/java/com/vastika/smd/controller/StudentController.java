package com.vastika.smd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.vastika.smd.model.Student;
import com.vastika.smd.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/add_student")
	public String getAddStudentForm() {
		return "addStudent";
	}
	
	@RequestMapping(value="/save_student", method =RequestMethod.POST)
	public String saveStudentInfo(@ModelAttribute Student student) {
		studentService.saveStudentInfo(student);
		
		return "redirect:/list_student";
		
	}
	@RequestMapping(value= "/update_student", method =RequestMethod.POST)
	public String updateStudentInfo(@ModelAttribute Student student) {
		studentService.updateStudentInfo(student);
		return "redirect:/list_student";
	}
	
	@RequestMapping(value= "/list_student")
	public String getAllStudentInfo(Model model) {
		model.addAttribute("students",studentService.getAllStudentInfo());
		return "listStudent";
	}
	
	@RequestMapping(value="/delete_student", method=RequestMethod.GET)
	public String deleteStudentInfo(@RequestParam int id) {
		studentService.deleteStudentInfo(id);
		return "redirect:/list_student";
	}
	
	@RequestMapping(value="/edit_student")
	public String getEditStudentForm(@RequestParam int id, Model model) {
		model.addAttribute("student", studentService.getStudentInfoById(id));
		return "editStudent";
	}
	
	@RequestMapping(value= "/list_student_names")
	public String getAllStudentName(Model model) {
		model.addAttribute("students",studentService.getAllStudentName());
		return "listStudentName";
	}
	
	@RequestMapping(value= "/list_student_personalInfo")
	public String getAllStudentPersonalInfo(Model model) {
		model.addAttribute("students",studentService.getAllStudentPersonalInfo());
		return "studentPersonalInfo";
	}
	
	@RequestMapping(value= "/list_student_contactInfo")
	public String getAllStudentContactInfo(Model model) {
		model.addAttribute("students",studentService.getAllStudentContactInfo());
		return "studentContactInfo";
	}
	
	
}
