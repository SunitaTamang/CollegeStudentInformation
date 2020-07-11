 package com.vastika.smd.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.vastika.smd.dto.Login;
import com.vastika.smd.model.College;
import com.vastika.smd.service.CollegeService;

@Controller
public class LoginController {

	private final CollegeService collegeService;
	

	@Autowired
	public LoginController(CollegeService collegeService) {
		this.collegeService = collegeService;
	}

	@GetMapping({ "/", "/login" })
	public String getLoginForm() {
		return "login";

	}

	@PostMapping("/college-login")
	public String login(@ModelAttribute Login login, HttpServletRequest request, HttpServletResponse  response, HttpSession session,
			Model model) {
		College college = collegeService.getCollegeByCollegeNameAndPassword(login.getCollegeName(), login.getPassWord());

		if (college != null) {
			session.setAttribute("cname", login.getCollegeName());
			session.setAttribute("id", college.getCollegeId());
			
			if(login.getRememberMe()!= null) {
				Cookie cookie1= new Cookie("collegename",login.getCollegeName());
				Cookie cookie2= new Cookie("password", login.getPassWord());
				Cookie cookie3= new Cookie("id", String.valueOf(college.getCollegeId()));
				
				cookie1.setMaxAge(100);
				cookie2.setMaxAge(100);
				cookie3.setMaxAge(100);
				
				 response.addCookie(cookie1);
				 response.addCookie(cookie2);
				 response.addCookie(cookie3);
			}
			return "redirect:/collegePage";

		}
		model.addAttribute("msg", "Wrong collegename or password!!!");
		return "login";
	}
	
	@GetMapping("/logout")
	public String getLoginForm(Model model, HttpSession session, HttpServletResponse response,HttpServletRequest request) {
		session.invalidate();
		
		Cookie [] cookies = request.getCookies();
		
		if (cookies!=null){
			for (int i =0; i<cookies.length;i++){
				if(cookies[i].getName().equals("collegename")){
					model.addAttribute("cname", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("password")){
					model.addAttribute("pass", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("id")){
					model.addAttribute("id", Integer.parseInt(cookies[i].getValue()));
				}
			}
		}
		
		model.addAttribute("msg", "You are successful logged out!!!");
		return "login";

	}

}
