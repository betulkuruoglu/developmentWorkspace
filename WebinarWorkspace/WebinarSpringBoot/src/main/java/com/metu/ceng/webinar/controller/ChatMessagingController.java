package com.metu.ceng.webinar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metu.ceng.webinar.service.ChatMessagingService;

@RestController
public class ChatMessagingController {

	@Autowired
	ChatMessagingService chatMessagingService;


	@GetMapping("/chatMessaging")
	public String chatMessaging() {
		String activeInfo = "Passive";
		if(1==chatMessagingService.getStatus()) {
			activeInfo = "Active";
		}
		return "Chat Messaging Call - Status: " + activeInfo; 
	}

	@GetMapping("/chatMessagingStatus")
	public int chatMessagingStatus() {
		return chatMessagingService.getStatus();
	}
	
	
}
