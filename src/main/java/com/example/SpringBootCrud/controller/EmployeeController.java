package com.example.SpringBootCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCrud.model.Employee;
import com.example.SpringBootCrud.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public ResponseEntity<?> postData(@RequestBody Employee employee) {
		System.out.println(2);
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/updateemployee")
	public ResponseEntity<?> updateData(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{deleteid}")
	public ResponseEntity<?> deleteData(@PathVariable("deleteid") int id) {
		
		return employeeService.deleteEmployeeById(id);
	}
	
	@GetMapping("/allemployees")
	public ResponseEntity<?> getAllData(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{employeebyid}")
	public ResponseEntity<?> getEmployeeData(@PathVariable("employeebyid") int id) {
		return employeeService.getEmployeeByID(id);
	}
}
