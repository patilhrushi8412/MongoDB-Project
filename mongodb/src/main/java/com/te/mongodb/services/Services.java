package com.te.mongodb.services;

import com.te.mongodb.document.Student;

public interface Services {

	Student addStudent(Student student);

	Student getStudent(int id);

	void deleteStudent(int id);

	Object getAllStudent();

	Student updateStudent(Student student);

}
