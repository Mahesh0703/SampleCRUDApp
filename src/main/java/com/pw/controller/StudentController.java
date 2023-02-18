package com.pw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pw.model1.Student;
import com.pw.service.Service;

@RestController
//@Controller
//@ResposeBody
@RequestMapping("/std-home")
public class StudentController {

	@Autowired
	Service service;
	
	@PostMapping("/insert")
	public Student insertStudent(@RequestBody Student std ) {
		Student dbStd = service.insertStudent(std);
		System.out.println("Added student ::"+ dbStd);
		return dbStd;
	}
	
	@GetMapping("/retrieve/{id}")
	public Student retrieveStudent(@PathVariable int id ) {
		Student student = service.findStudentById(id);
		return student;
	}
	
	@DeleteMapping("/remove/{id}")
	public String removeStudent(@PathVariable int id) {
		service.removeStudent(id);
		String s="student removed";
		return s;
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student std,@PathVariable int id) {
		System.out.println(" id is ::"+ id);
		Student updateStudent = service.updateStudent(std,id);
		return updateStudent;
	}
	
	
}
