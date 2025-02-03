package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class StudentController {
	
	@Autowired
	CustomerService stuSer;
	
	@PostMapping("/stpeters/college/student/add")
	public String addNewStudent(@RequestBody Customer stuData){
		
		
		stuSer.saveStudentNewRecord(stuData);
		
		return "successfully added new record----->";
		
	}
	@PostMapping("/stpeters/college/student/add/all")
	public String addNewStudent(@RequestBody List<Customer> stuList){
		
		
		stuSer.saveAllStudents(stuList);
		
		return "successfully added all records----->";
		
	}

}
