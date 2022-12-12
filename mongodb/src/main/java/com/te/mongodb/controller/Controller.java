package com.te.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.mongodb.document.Student;
import com.te.mongodb.responce.Responce;
import com.te.mongodb.services.Services;

@RestController
public class Controller {

	@Autowired
	Services service;

	@PostMapping("/addStudent")
	public ResponseEntity<Responce> addStudent(@RequestBody Student student) {
		Student student1 = service.addStudent(student);
		return new ResponseEntity<Responce>(new Responce(false, "Student Added Succesfully", student1), HttpStatus.OK);
	}

	@GetMapping("/getStudent")
	public ResponseEntity<Responce> getStudent(@RequestParam int id) {
		Student student1 = service.getStudent(id);
		return new ResponseEntity<Responce>(new Responce(false, "Student Detail", student1), HttpStatus.OK);
	}

	@DeleteMapping("/deleteStudent")
	public ResponseEntity<Responce> deleteStudent(@RequestParam int id) {
		service.deleteStudent(id);
		return new ResponseEntity<Responce>(new Responce(false, "Student Deleted Succesfully", null), HttpStatus.OK);
	}

	@GetMapping("/getAllStudentDetails")
	public ResponseEntity<Responce> getAllStudent() {
		Object list = service.getAllStudent();
		return new ResponseEntity<Responce>(new Responce(false, "All Students Detail", list), HttpStatus.OK);
	}

	@PutMapping("/updateStudent")
	public ResponseEntity<Responce> updateStudent(@RequestBody Student student) {
		Student student1 = service.updateStudent(student);
		return new ResponseEntity<Responce>(new Responce(false, "Student Updated Succesfully", student1), HttpStatus.OK);
	}

}
