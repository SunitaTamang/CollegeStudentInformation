package com.vastika.smd.service;

import java.util.List;

import com.vastika.smd.model.Student;

public interface StudentService {
	
	void saveStudentInfo(Student student);
	
	List<Student> getAllStudentInfo();
	
	void deleteStudentInfo(int id);
	
	Student getStudentInfoById (int id);
	
	void updateStudentInfo(Student student);
	
	List<Student> getAllStudentName();

	List<Student> getAllStudentPersonalInfo();

	List<Student> getAllStudentContactInfo();

}
