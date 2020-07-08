package com.vastika.smd.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.model.College;
import com.vastika.smd.service.CollegeService;
import com.vastika.smd.util.ImageUtil;

@Controller
public class ImageDisplayController {
	private final CollegeService collegeService;
	
	@Autowired
	public ImageDisplayController(CollegeService collegeService) {
		this.collegeService=collegeService;
	}

	@GetMapping("/image_display")
	public void displayImage(@RequestParam int id, HttpServletResponse response) {
		System.out.println("id is:" +id);
		College college= collegeService.getCollegeInfoById(id);
		ImageUtil.readImageFromDIsk(college.getImageUrl(), response);
	}
}
