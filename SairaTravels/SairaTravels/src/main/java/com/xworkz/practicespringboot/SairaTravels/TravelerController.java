package com.xworkz.practicespringboot.SairaTravels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelerController {

	@Autowired
	private TravelerServiceConfiguration configuration;

	@RequestMapping("/traveler")
	public TravelerServiceConfiguration getTravelerService() {
		return configuration;
	}
}
