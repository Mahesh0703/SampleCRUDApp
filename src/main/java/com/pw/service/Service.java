package com.pw.service;

import com.pw.model1.Student;

public interface Service {

	Student insertStudent(Student std);

	Student findStudentById(int id);

	void removeStudent(int id);

	Student updateStudent(Student std, int id);

}
