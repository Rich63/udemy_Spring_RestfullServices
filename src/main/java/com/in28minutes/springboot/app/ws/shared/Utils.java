package com.in28minutes.springboot.app.ws.shared;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class Utils {
	
	public String generateUserId() {
		return UUID.randomUUID().toString();
	}

}
