package com.vastika.smd.repository;

import java.util.List;

import com.vastika.smd.model.Student;
import com.vastika.smd.model.Student;

public interface StudentRepository {

	void saveStudentInfo(Student student);
	
	List<Student> getAllStudentInfo();
	
	void deleteStudentInfo(int id);
	
	Student getStudentInfoById (int id);
	
	void updateStudentInfo(Student student);

	List<Student> getAllStudentName();

	List<Student> getAllStudentPersonalInfo();
	
	List<Student> getAllStudentContactInfo();
	
	Student getStudentByStudentNameAndPassword(String studentName, String spassWord);
	
	void resetStudentPassword(Student student);
	
	Student getStudentByEmail (String email);


}
