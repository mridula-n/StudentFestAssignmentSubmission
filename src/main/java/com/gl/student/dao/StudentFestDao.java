package com.gl.student.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.student.entity.Student;

public interface StudentFestDao {

	public List<Student> RegisterdStudentsList();
	
	void RegisterStudent(Student studentEntityO);
	
	public void DeleteStudent(int studentid);
	
	public Student FindStudent(int studentid);

	public void UpdateStudent(Student student);
	
}
