package com.te.mongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Students")
@Data
public class Student {

	@Id
	private int id;
	private String name;
	private String email;
	private long mobile;

}
