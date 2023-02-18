package com.pw.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pw.dao.StudentDao;
import com.pw.model1.Student;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	StudentDao dao;
	@Override
	public Student insertStudent(Student std) {
		 Student dbStd = dao.save(std);
		return dbStd;
	}
	@Override
	public Student findStudentById(int id) {
		 Student student = dao.findById(id).get();
		return student;
	}
	@Override
	public void removeStudent(int id) {
		dao.deleteById(id);
		
	}
	@Override
	public Student updateStudent(Student std, int id) {
	Student std1= new Student();
		std1.setId(id);
		
		String name = std.getName();
		std1.setName(name);
		
		String city = std.getCity();
		std1.setCity(city);
		
		Student student = dao.save(std1);
		return student;
	}

	
}
