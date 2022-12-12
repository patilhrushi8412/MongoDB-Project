package com.te.mongodb.responce;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Responce {

	private boolean error;
	private String message;
	private Object data;

}
