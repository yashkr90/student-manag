package com.ibm.studentmanagementsystemrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.studentmanagementsystemrestapi.entity.Student;
import com.ibm.studentmanagementsystemrestapi.service.StudentService;


@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/students")
@RestController
public class StudentController {

	
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping
	public Iterable<Student> getAll() {
		return studentService.getAllStudents();
	}
}
