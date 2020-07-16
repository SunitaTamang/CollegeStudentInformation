package com.vastika.smd.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.smd.model.Student;
import com.vastika.smd.model.Student;
import com.vastika.smd.util.HibernateUtil;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveStudentInfo(Student student) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.save(student);
		
		
	}

	@Override
	public List<Student> getAllStudentInfo() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	@Override
	public void deleteStudentInfo(int id) {
		Student student = getStudentInfoById(id);
		if (student != null) {
			Session session = HibernateUtil.getSession(sessionFactory);
			session.delete(student);
		}
		
	}

	@Override
	public Student getStudentInfoById(int id) {
		
		Session session = HibernateUtil.getSession(sessionFactory);
		return (Student) session.get(Student.class, id);
	}

	@Override
	public void updateStudentInfo(Student student) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.update(student);
		
	}
	
	@Override
	public List<Student> getAllStudentName() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	@Override
	public List<Student> getAllStudentPersonalInfo() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	@Override
	public List<Student> getAllStudentContactInfo() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	@Override
	public Student getStudentByStudentNameAndPassword(String studentName, String spassWord) {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("studentName", studentName)).add(Restrictions.eq("spassWord", spassWord));
		return (Student) criteria.uniqueResult();
	}

	@Override
	public void resetStudentPassword(Student student) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.update(student);
		
	}

	@Override
	public Student getStudentByEmail(String email) {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("email", email));
		return (Student) criteria.uniqueResult();
	}
	

}
