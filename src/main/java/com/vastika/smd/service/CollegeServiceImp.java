package com.vastika.smd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.smd.model.College;
import com.vastika.smd.repository.CollegeRepository;


@Service
@Transactional
public class CollegeServiceImp implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public void saveCollegeInfo(College college) {
		collegeRepository.saveCollegeInfo(college);

	}

	@Override
	public List<College> getAllCollegeInfo() {

		return collegeRepository.getAllCollegeInfo();
	}

	@Override
	public void deleteCollegeInfo(int id) {
		collegeRepository.deleteCollegeInfo(id);

	}

	@Override
	public College getCollegeInfoById(int id) {
		return collegeRepository.getCollegeInfoById(id);

	}

	@Override
	public void updateCollegeInfo(College college) {
		collegeRepository.updateCollegeInfo(college);
	}


}
