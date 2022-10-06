package com.metu.ceng.webinar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metu.ceng.webinar.service.PassPresenterService;

@RestController
public class PassPresenterController {

	@Autowired
	PassPresenterService passPresenterService;


	@GetMapping("/passPresenter")
	public String passPresenter() {
		String activeInfo = "Passive";
		if(1==passPresenterService.getStatus()) {
			activeInfo = "Active";
		}
		return "Pass Presenter Call - Status: " + activeInfo;  
	}

	@GetMapping("/passPresenterStatus")
	public int passPresenterStatus() {
		return passPresenterService.getStatus();
	}

}


