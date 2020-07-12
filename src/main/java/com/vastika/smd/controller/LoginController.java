 package com.vastika.smd.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.dto.EmailDto;
import com.vastika.smd.dto.Login;
import com.vastika.smd.model.College;
import com.vastika.smd.service.CollegeService;
import com.vastika.smd.util.EmailUtil;

@Controller
public class LoginController {

	private final CollegeService collegeService;
	
	private final MailSender mailSender;

	@Autowired
	public LoginController(CollegeService collegeService,MailSender mailSender) {
		this.mailSender = mailSender;
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
					model.addAttribute("uname", cookies[i].getValue());
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
	
	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestParam String email, Model model) {
		College college = collegeService.getCollegeByEmail(email);
		if (college !=null) {
			String newPassword = getRandomPassword();
			college.setPassWord(newPassword);
			collegeService.updateCollegeInfo(college);
			
			EmailDto emailDto = new EmailDto();
			emailDto.setFromAddress("");
			emailDto.setToAddress(college.getCollegeEmail());
			emailDto.setSubject("password reset");
			String msgBody="your new password is :"+ newPassword;
			emailDto.setMsgBody(msgBody);
			EmailUtil.sendEmail(mailSender, emailDto);
			model.addAttribute("forgotPassMsg","Your password has been reset successfully!!!" );
		}
		model.addAttribute("forgotPassMsg","Your email is invalid!!!" );
		return "login";
	}
	
	private String getRandomPassword() {
		SecureRandom random = new SecureRandom();
		String password= new BigInteger(50, random).toString(30);
		return password;
	}

}
