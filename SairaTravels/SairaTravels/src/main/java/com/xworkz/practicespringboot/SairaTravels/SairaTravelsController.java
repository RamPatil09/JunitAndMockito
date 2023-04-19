package com.xworkz.practicespringboot.SairaTravels;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SairaTravelsController {

	@RequestMapping("/customers")
	public List<CustomerDto> retriveAllDatas() {
		return Arrays.asList(new CustomerDto(1, "Raman", 24, "Male"), new CustomerDto(2, "Viresh", 23, "Male"),
				new CustomerDto(3, "Samyuktha", 24, "Female"));
	}
}
