package com.example.demo.Service;

import java.util.List;

import com.example.demo.Domain.Student;

public interface StudentService {
	public Student saveEtd(Student std);
	public List<Student> getAllStudents();

}
