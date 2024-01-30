package com.ibm.studentmanagementsystemrestapi.service;

import com.ibm.studentmanagementsystemrestapi.entity.Student;

public interface StudentService {

	Student createStudent(Student student);

	Iterable<Student> getAllStudents();
}
