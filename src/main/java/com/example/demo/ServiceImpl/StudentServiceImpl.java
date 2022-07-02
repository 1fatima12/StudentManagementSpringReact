package com.example.demo.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
    StudentRepository stdRep;
	@Override
	public Student saveEtd(Student std) {
		return stdRep.save(std);
	}
	@Override
	public List<Student> getAllStudents() {
		return stdRep.findAll();
	}

}
