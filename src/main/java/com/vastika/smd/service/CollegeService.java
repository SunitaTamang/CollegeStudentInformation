package com.vastika.smd.service;

import java.util.List;

import com.vastika.smd.model.College;

public interface CollegeService {

	void saveCollegeInfo(College college);
	
	List<College> getAllCollegeInfo();
	
	void deleteCollegeInfo(int id);
	
	College getCollegeInfoById (int id);
	
	void updateCollegeInfo(College college);

	College getCollegeByCollegeNameAndPassword(String collegeName, String passWord);

	void resetCollegePassword(College college);
	
	College getCollegeByEmail (String email);
	
}
