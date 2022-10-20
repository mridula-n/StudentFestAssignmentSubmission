package com.gl.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.student.dao.StudentFestDao;
import com.gl.student.entity.Student;
import com.gl.student.service.StudentFestService;
import com.gl.student.service.StudentFestServiceImpl;

@Controller
@RequestMapping("/")
public class StudentController {

	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private StudentFestService studentFestService;// = new
	/*
	 * @Autowired private StudentFestDao studentFestDao ;
	 */

	@RequestMapping("/hello")
	public String helloworld() {
		return "demo";

	}

	
	  @RequestMapping("/registeredStudentList") 
	  public String RegisterdStudentsList(Model model) {
	  
	  List<Student> students = new ArrayList<Student>();
	  
	  students = studentFestService.RegisterdStudentsList();
	  System.out.println(students.get(0));
	  model.addAttribute("viewStudents"
			  , students);
	  
	  		return "registeredStudentList"; 
	}
	  
	  @RequestMapping("registerNewStudent") public String RegisterStudent(Model
	  model , @RequestParam String action , @RequestParam int studentId) {
	
		  if (action.equalsIgnoreCase("R") && !action.isEmpty()) {
			  
				
		  Student student = new Student();

		  model.addAttribute("student", student);
		  model.addAttribute("action", action);
		 
		  }
		  else if (action.equalsIgnoreCase("U") && !action.isEmpty()) {
			  
			Student student = studentFestService.FindStudent(studentId);

			  model.addAttribute("student", student);
			  model.addAttribute("action", action);	
			  
		  }
		  
		  System.out.println(action);
		  
	  return ("CreateStudentForm");
	  
	  }
	  
	  @RequestMapping("saveRegistration") public String SaveRegistration(
	  
	  @RequestParam("studentid") int studentid,
	  
	  @RequestParam("name") String name,
	  
	  @RequestParam("department") String department,
	  
	  @RequestParam("country") String country,
	  @RequestParam("action") String action ) {
	  
	  Student student = new Student(name, department, country);
	  
	  System.out.println("hello" + student.toString());
	  System.out.println("ID"+studentid);
	  System.out.println(action);
	  
	  if (action.equalsIgnoreCase("R") && !action.isEmpty()) {
		  
	  studentFestService.RegisterStudent(student); 
	  }
	  else if (action.equalsIgnoreCase("U") && !action.isEmpty())
	  {
		  studentFestService.UpdateStudent(student);   
	  }
	  
	  return "redirect:/registeredStudentList";
	  
	  }
	  
	  @RequestMapping("/DeleteStudent") 
	  public String DeleteStudent(@RequestParam("studentid") int studentid,Model model) {
		  
		  studentFestService.DeleteStudent(studentid);
	  
	  		return "redirect:/registeredStudentList"; 
	}
	  
	
}
