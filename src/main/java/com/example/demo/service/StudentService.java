package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;

	public void saveStudentNewRecord(Customer stuData) {
		
		stuRepo.save(stuData);
	}

	public void saveAllStudents(List<Customer> stuList) {
		stuRepo.saveAll(stuList);
	}

}
