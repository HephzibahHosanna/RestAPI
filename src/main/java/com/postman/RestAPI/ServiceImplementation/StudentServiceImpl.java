package com.postman.RestAPI.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.postman.RestAPI.Service.StudentService;
import com.postman.RestAPI.dao.StudentRepository;
import com.postman.RestAPI.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);//same method is used to save and update a new student
	}

	@Override
	public List<Student> findAllStudents() {
		return (List<Student>) studentRepo.findAll();//casting is needed as it returns a list
	}

	@Override
	public void deleteStudent(int id) {
		//to delete student
		studentRepo.deleteById(id);
	}

}
