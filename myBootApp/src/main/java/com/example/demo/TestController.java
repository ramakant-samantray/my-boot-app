package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handleTest() {
		return "this is ramakant from spring boot";
	}
	
	@RequestMapping("/employee")
	@ResponseBody
	public List<Employee> GetEmployee() {
		List<Employee> employeeList = Arrays.asList(
				new Employee("ramakant", "samantray", 10000),
				new Employee("kiran", "pradhan", 20000)
				);
		
		return employeeList;
	}
}
