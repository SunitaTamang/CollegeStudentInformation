package com.vastika.smd.repository;

import java.util.List;

import com.vastika.smd.model.College;


public interface CollegeRepository {
	
	void saveCollegeInfo(College college);
	
	List<College> getAllCollegeInfo();
	
	void deleteCollegeInfo(int id);
	
	College getCollegeInfoById (int id);
	
	void updateCollegeInfo(College college);

	College getCollegeByCollegeNameAndPassword(String collegeName, String passWord);
	}
