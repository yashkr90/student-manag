package com.ibm.studentmanagementsystemrestapi.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.studentmanagementsystemrestapi.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String>{

	
}
