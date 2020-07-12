package com.vastika.smd.util;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.vastika.smd.dto.EmailDto;

public class EmailUtil {
	
	public static void sendEmail(MailSender mailSender,EmailDto emailDto ) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(emailDto.getFromAddress());
		mailMessage.setSubject(emailDto.getSubject());
		mailMessage.setText(emailDto.getMsgBody());
		mailMessage.setTo(emailDto.getToAddress());
		mailSender.send(mailMessage);
	}
	
}
