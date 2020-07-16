package com.vastika.smd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.smd.model.Student;
import com.vastika.smd.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudentInfo(Student student) {
		studentRepository.saveStudentInfo(student);

	}

	@Override
	public List<Student> getAllStudentInfo() {

		return studentRepository.getAllStudentInfo();
	}

	@Override
	public void deleteStudentInfo(int id) {
		studentRepository.deleteStudentInfo(id);

	}

	@Override
	public Student getStudentInfoById(int id) {
		return studentRepository.getStudentInfoById(id);

	}

	@Override
	public void updateStudentInfo(Student student) {
		studentRepository.updateStudentInfo(student);
	}

	@Override
	public List<Student> getAllStudentName() {
		return studentRepository.getAllStudentName();
	}

	@Override
	public List<Student> getAllStudentPersonalInfo() {
		return studentRepository.getAllStudentPersonalInfo();
		}

	@Override
	public List<Student> getAllStudentContactInfo() {
		return studentRepository.getAllStudentContactInfo();
	}

	@Override
	public Student getStudentByStudentNameAndPassword(String studentName, String spassWord) {
		return studentRepository.getStudentByStudentNameAndPassword(studentName, spassWord);
	}

	@Override
	public void resetStudentPassword(Student student) {
		studentRepository.updateStudentInfo(student);
		
	}

	@Override
	public Student getStudentByEmail(String email) {
		return studentRepository.getStudentByEmail(email);
	}

	
	


}
