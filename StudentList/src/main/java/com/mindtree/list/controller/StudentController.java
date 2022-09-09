package com.mindtree.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.list.entity.Student;
import com.mindtree.list.serviceimp.StudentServiceImp;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImp service;
	
	@GetMapping("/employee")
	public List<Student> getEmployees(){
		return service.getAll();
	}
	@GetMapping("/employees/{id}")
	public Student getEmployee(@PathVariable int id) {
		return service.getById(id);
	}
}
