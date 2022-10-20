package com.gl.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.student.dao.StudentFestDaoImpl;
import com.gl.student.entity.Student;
import com.gl.student.dao.StudentFestDao;
import com.gl.student.entity.Student;

@Service
public class StudentFestServiceImpl implements StudentFestService {
	
	@Autowired
	StudentFestDao studentFestDao ;
	
	public StudentFestServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	@Override
	public List<Student> RegisterdStudentsList() {
		
		try {
			return studentFestDao.RegisterdStudentsList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void RegisterStudent(Student student) {
		// TODO Auto-generated method stub
		
			System.out.println(student.toString());
		  studentFestDao.RegisterStudent(student);
		
	}


	@Override
	public void DeleteStudent(int studentid) {
		// TODO Auto-generated method stub
		
		studentFestDao.DeleteStudent(studentid);
		
	}


	@Override
	public Student FindStudent(int studentid) {
		// TODO Auto-generated method stub
		return studentFestDao.FindStudent(studentid);
	}


	@Override
	public void UpdateStudent(Student student) {
		
		// TODO Auto-generated method stub
		
		 studentFestDao.UpdateStudent(student);
		
	}

}
