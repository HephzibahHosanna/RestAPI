package com.postman.RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postman.RestAPI.ServiceImplementation.StudentServiceImpl;
import com.postman.RestAPI.model.Student;

@RestController
//postman is used to perform operations hence cross origin annotation is added.
@CrossOrigin("*")
public class HomeController {

	//to create bean of implementation class
	@Autowired  
	private StudentServiceImpl studentServiceImpl;
	
	//to call save method or to save a new student
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Student save works properly!");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	//to find all students from database
	@GetMapping(value = "getAllStudents")
	public List<Student> findAllStudent() {
		return studentServiceImpl.findAllStudents();
	}
	
	//to update student data from database
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
	 
//to delete student data from the database
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student deleted!";
	}
	
}

