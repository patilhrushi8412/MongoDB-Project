package com.te.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.te.mongodb.document.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Integer>{

}
