package com.vastika.smd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.vastika.smd.model.College;
import com.vastika.smd.service.CollegeService;
import com.vastika.smd.util.ImageUtil;

@Controller
public class CollegeController {
	@Autowired
	private CollegeService collegeService;
	
	@RequestMapping(value= "/collegePage")
	public String getHomePage() {
		return "collegePage";
		}

	@RequestMapping(value="/add_college")
	public String getAddCollegeForm() {
		return "addCollege";
	}
	
	@RequestMapping(value="/save_college", method =RequestMethod.POST)
	public String saveCollegeInfo(@ModelAttribute College college, @RequestParam CommonsMultipartFile file) {
		String imageUrl= ImageUtil.writeImageToDisk(file);
		college.setImageUrl(imageUrl);
		collegeService.saveCollegeInfo(college);
		
		return "redirect:/list_college";
		
	}
	@RequestMapping(value= "/update_college", method =RequestMethod.POST)
	public String updateCollegeInfo(@ModelAttribute College user) {
		collegeService.updateCollegeInfo(user);
		return "redirect:/list_college";
	}
	
	@RequestMapping(value= "/list_college")
	public String getAllCollegeInfo(Model model) {
		model.addAttribute("colleges",collegeService.getAllCollegeInfo());
		return "listCollege";
	}
	
	@RequestMapping(value="/delete_college", method=RequestMethod.GET)
	public String deleteCollegeInfo(@RequestParam int id) {
		collegeService.deleteCollegeInfo(id);
		return "redirect:/list_college";
	}
	
	@RequestMapping(value="/edit_college")
	public String getEditCollegeForm(@RequestParam int id, Model model) {
		model.addAttribute("college", collegeService.getCollegeInfoById(id));
		return "editCollege";
	}

}
