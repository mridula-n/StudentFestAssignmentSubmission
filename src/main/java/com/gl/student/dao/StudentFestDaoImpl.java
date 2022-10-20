package com.gl.student.dao;

import java.util.List;

import javax.transaction.Synchronization;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gl.student.entity.Student;

@Repository
public class StudentFestDaoImpl implements StudentFestDao {

	public StudentFestDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	private Session session;
	private SessionFactory sessionFactory;
	
	@Autowired
	public StudentFestDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	try {
		session = sessionFactory.getCurrentSession();
	} catch (Exception e) {
		
		session = sessionFactory.openSession();
		// TODO: handle exception
	}
		
	}

	@Transactional
	@Override
	public List<Student> RegisterdStudentsList() {
		// TODO Auto-generated method stub
		

		 System.out.println("before list");
		 
		 Transaction tx = session.beginTransaction();
		
		 List<Student>  registerdStudentsList = 
				 session.createQuery("from Student").list();
		 
		 tx.commit();
		 
		 System.out.println("after list");
			 
		return registerdStudentsList;
	}
	
	@Transactional
	@Override
	public void RegisterStudent(Student studentEntityO)
	{
		System.out.println("jjj");
		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(studentEntityO);
		
		tx.commit();
		
	}

	@Override
	public void DeleteStudent(int studentid) {
		// TODO Auto-generated method stub

Transaction tx = session.beginTransaction();

	Student st = new Student();
	
	st = session.get(Student.class,studentid);
		
		session.delete( st);;
		
		tx.commit();
		
	}

	@Override
	public Student FindStudent(int studentid) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Student st = new Student();
		st = session.get(Student.class,studentid);

		tx.commit();
		
		
		return st;
	}

	@Override
	public void UpdateStudent(Student student) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(student);
		tx.commit();
		
	}

}
