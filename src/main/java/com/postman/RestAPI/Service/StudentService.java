package com.postman.RestAPI.Service;

import java.util.List;
import com.postman.RestAPI.model.Student;

public interface StudentService {

	//to save new student
	public Student saveStudent(Student student);
	
	//to update student
	public Student updateStudent(Student student);
	
	//to fetch all students from the database
	public List<Student> findAllStudents();
	
	//to delete student
	public void deleteStudent(int id);
}
