package com.te.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mongodb.document.Student;
import com.te.mongodb.repo.StudentRepo;

@Service
public class ServiceImpl implements Services{

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student student) {
		Student save = repo.save(student);
		return save;
	}

	@Override
	public Student getStudent(int id) {
		Optional<Student> findById = repo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

	@Override
	public Object getAllStudent() {
		List<Student> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public Student updateStudent(Student student) {
		Optional<Student> findById = repo.findById(student.getId());
		findById.get().setName(student.getName());
		findById.get().setEmail(student.getEmail());
		findById.get().setMobile(student.getMobile());
		Student save = repo.save(findById.get());
		return save;
	}

}
