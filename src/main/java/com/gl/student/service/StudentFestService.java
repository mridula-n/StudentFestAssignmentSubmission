package com.gl.student.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gl.student.entity.*;


//@Service
public interface StudentFestService {
	
	public List<Student> RegisterdStudentsList();
	
	public void RegisterStudent(Student student);
	
	public void DeleteStudent(int studentid);
	
	public Student FindStudent(int studentid);
	
	public void UpdateStudent(Student student);

}
