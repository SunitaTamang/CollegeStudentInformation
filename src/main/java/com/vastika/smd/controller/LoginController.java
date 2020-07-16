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
import com.vastika.smd.model.Student;
import com.vastika.smd.service.CollegeService;
import com.vastika.smd.service.StudentService;
import com.vastika.smd.util.EmailUtil;



@Controller
public class LoginController {

	private final CollegeService collegeService ;
	
	private final StudentService studentService;
	
	private final MailSender mailSender;

	@Autowired
	public LoginController(CollegeService collegeService,StudentService studentService,MailSender mailSender) {
		this.mailSender = mailSender;
		this.collegeService = collegeService;
		this.studentService= studentService;
	}

	@GetMapping( "/collegeLogin" )
	public String getCollegeLoginForm() {
		return "collegeLogin";

	}
	
	@GetMapping( "/studentLogin" )
	public String geStudentLoginForm() {
		return "studentLogin";

	}

	@PostMapping("/college-login")
	public String collegeLogin(@ModelAttribute Login collegeLogin, HttpServletRequest request, HttpServletResponse  response, HttpSession session,
			Model model) {
		College college = collegeService.getCollegeByCollegeNameAndPassword(collegeLogin.getCollegeName(), collegeLogin.getCpassWord());

		if (college != null) {
			session.setAttribute("cname", collegeLogin.getCollegeName());
			session.setAttribute("id", college.getCollegeId());
			
			if(collegeLogin.getRememberMe()!= null) {
				Cookie cookie1= new Cookie("collegename",collegeLogin.getCollegeName());
				Cookie cookie2= new Cookie("password", collegeLogin.getCpassWord());
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
		return "collegeLogin";
	}
	
	@PostMapping("/student-login")
	public String studentLogin(@ModelAttribute Login studentLogin, HttpServletRequest request, HttpServletResponse  response, HttpSession session,
			Model model) {
		Student student = studentService.getStudentByStudentNameAndPassword(studentLogin.getStudentName(), studentLogin.getSpassWord());

		if (student != null) {
			session.setAttribute("sname", studentLogin.getStudentName());
			session.setAttribute("id", student.getStudentId());
			
			if(studentLogin.getRememberMe()!= null) {
				Cookie cookie1= new Cookie("studentname",studentLogin.getStudentName());
				Cookie cookie2= new Cookie("password", studentLogin.getSpassWord());
				Cookie cookie3= new Cookie("id", String.valueOf(student.getStudentId()));
				
				cookie1.setMaxAge(100);
				cookie2.setMaxAge(100);
				cookie3.setMaxAge(100);
				
				 response.addCookie(cookie1);
				 response.addCookie(cookie2);
				 response.addCookie(cookie3);
			}
			return "redirect:/studentPage";

		}
		model.addAttribute("msg", "Wrong Student Name or password!!!");
		return "studentLogin";
	}
	
	@GetMapping("/collegelogout")
	public String getCollegeLoginForm(Model model, HttpSession session, HttpServletResponse response,HttpServletRequest request) {
		session.invalidate();
		
		Cookie [] cookies = request.getCookies();
		
		if (cookies!=null){
			for (int i =0; i<cookies.length;i++){
				if(cookies[i].getName().equals("collegename")){
					model.addAttribute("cname", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("password")){
					model.addAttribute("cpass", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("id")){
					model.addAttribute("id", Integer.parseInt(cookies[i].getValue()));
				}
			}
		}
		
		model.addAttribute("msg", "You are successful logged out!!!");
		return "collegeLogin";

	}
	
	@GetMapping("/studentlogout")
	public String getStudentLoginForm(Model model, HttpSession session, HttpServletResponse response,HttpServletRequest request) {
		session.invalidate();
		
		Cookie [] cookies = request.getCookies();
		
		if (cookies!=null){
			for (int i =0; i<cookies.length;i++){
				if(cookies[i].getName().equals("studentname")){
					model.addAttribute("sname", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("password")){
					model.addAttribute("spass", cookies[i].getValue());
				}
				else if(cookies[i].getName().equals("id")){
					model.addAttribute("id", Integer.parseInt(cookies[i].getValue()));
				}
			}
		}
		
		model.addAttribute("msg", "You are successful logged out!!!");
		return "studentLogin";

	}
	
	
	@PostMapping("/forgot-college-password")
	public String forgotCollegePassword(@RequestParam String cemail, Model model) {
		College college = collegeService.getCollegeByEmail(cemail);
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
		return "collegeLogin";
	}
	
	@PostMapping("/forgot-student-password")
	public String forgotStudentPassword(@RequestParam String semail, Model model) {
		Student student = studentService.getStudentByEmail(semail);
		if (student !=null) {
			String newPassword = getRandomPassword();
			student.setSpassWord(newPassword);
			studentService.updateStudentInfo(student);
			
			EmailDto emailDto = new EmailDto();
			emailDto.setFromAddress("");
			emailDto.setToAddress(student.getStudentEmail());
			emailDto.setSubject("password reset");
			String msgBody="your new password is :"+ newPassword;
			emailDto.setMsgBody(msgBody);
			EmailUtil.sendEmail(mailSender, emailDto);
			model.addAttribute("forgotPassMsg","Your password has been reset successfully!!!" );
		}
		model.addAttribute("forgotPassMsg","Your email is invalid!!!" );
		return "studentLogin";
	}
	private String getRandomPassword() {
		SecureRandom random = new SecureRandom();
		String password= new BigInteger(50, random).toString(30);
		return password;
	}

}
