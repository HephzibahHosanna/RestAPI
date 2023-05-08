package com.postman.RestAPI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.postman.RestAPI.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Object>{

}
