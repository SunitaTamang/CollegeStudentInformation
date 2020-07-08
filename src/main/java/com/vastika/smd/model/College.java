package com.vastika.smd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tbl_college")

public class College {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int collegeId;
	@Column(name="College_name")
	private String collegeName;
	@Column(name="College_Email")
	private String collegeEmail;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateofEstablishment;
	@Column(name="College_phone_number")
	private String collegePhoneno;
	@Column(name="College_address")
	private String collegeAddress;
	
	private String ImageUrl;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeEmail() {
		return collegeEmail;
	}

	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}

	public Date getDateofEstablishment() {
		return dateofEstablishment;
	}

	public void setDateofEstablishment(Date dateofEstablishment) {
		this.dateofEstablishment = dateofEstablishment;
	}

	public String getCollegePhoneno() {
		return collegePhoneno;
	}

	public void setCollegePhoneno(String collegePhoneno) {
		this.collegePhoneno = collegePhoneno;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	
	

	
}
