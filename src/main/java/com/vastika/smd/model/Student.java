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
	@Table(name="tbl_student")

	public class Student {
		
		@Id
		@GeneratedValue(strategy =GenerationType.AUTO)
		private int studentId;
		@Column(name="Student_name")
		private String studentName;
		@Column(name="Student_Email")
		private String studentEmail;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		@Temporal(TemporalType.DATE)
		private Date dateofBirth;
		@Column(name="Student_Phone_Number")
		private String studentPhoneno;
		@Column(name="Student_address")
		private String studentAddress;
		private String studentDocuments;
		private String studentProcessStatus;
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentEmail() {
			return studentEmail;
		}
		public void setStudentEmail(String studentEmail) {
			this.studentEmail = studentEmail;
		}
		public Date getDateofBirth() {
			return dateofBirth;
		}
		public void setDateofBirth(Date dateofBirth) {
			this.dateofBirth = dateofBirth;
		}
		public String getStudentPhoneno() {
			return studentPhoneno;
		}
		public void setStudentPhoneno(String studentPhoneno) {
			this.studentPhoneno = studentPhoneno;
		}
		public String getStudentAddress() {
			return studentAddress;
		}
		public void setStudentAddress(String studentAddress) {
			this.studentAddress = studentAddress;
		}
		public String getStudentDocuments() {
			return studentDocuments;
		}
		public void setStudentDocuments(String studentDocuments) {
			this.studentDocuments = studentDocuments;
		}
		public String getStudentProcessStatus() {
			return studentProcessStatus;
		}
		public void setStudentProcessStatus(String studentProcessStatus) {
			this.studentProcessStatus = studentProcessStatus;
		}
		
		
		
		
		

}
