package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface StudentRepo 
       extends JpaRepository<Customer, Integer>{

}
