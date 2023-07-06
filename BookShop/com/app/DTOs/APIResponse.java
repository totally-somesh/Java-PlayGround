package com.app.DTOs;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIResponse {
	
	private String msg;
	
	private LocalDateTime timeStamp;
	
	public APIResponse(String msg) {
		
		this.msg = msg;
		this.timeStamp = LocalDateTime.now();		
	}

}
