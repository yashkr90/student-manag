package com.ibm.studentmanagementsystemrestapi.service;

import org.springframework.stereotype.Service;

import com.ibm.studentmanagementsystemrestapi.entity.Student;
import com.ibm.studentmanagementsystemrestapi.repo.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	
	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Iterable<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
