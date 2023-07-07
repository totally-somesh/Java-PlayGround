package com.app.DTOs;

import java.time.LocalDateTime;

import lombok.Setter;

import lombok.Getter;

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
