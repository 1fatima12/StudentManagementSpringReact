package com.example.demo.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {
	@Autowired
	StudentService stdServ;
	@PostMapping("/Add")
	public Student AddStudent( @RequestBody Student std) {
		return stdServ.saveEtd(std);
		
	}
	@GetMapping("/getAll")
	public List<Student> RecupererTout(){
		return stdServ.getAllStudents();
	}

}
