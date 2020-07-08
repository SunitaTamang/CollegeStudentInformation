package com.vastika.smd.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.vastika.smd.model.College;
import com.vastika.smd.util.HibernateUtil;

@Repository
public  class CollegeRepositoryImp implements CollegeRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveCollegeInfo(College college) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.save(college);
		
	}

	@Override
	public List<College> getAllCollegeInfo() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(College.class);
		return criteria.list();
		
	}

	@Override
	public void deleteCollegeInfo(int id) {
		College college = getCollegeInfoById(id);
		if (college != null) {
			Session session = HibernateUtil.getSession(sessionFactory);
			session.delete(college);
		}
	}

	@Override
	public College getCollegeInfoById(int id) {
		Session session = HibernateUtil.getSession(sessionFactory);
		return (College) session.get(College.class, id);
	}

	@Override
	public void updateCollegeInfo(College college) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.update(college);
		
	}




	
}
