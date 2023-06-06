package com.example.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.SpringBootCrud.model.Employee;
import com.example.SpringBootCrud.repository.EmployeeRepository;




@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public ResponseEntity<Object> addEmployee(Employee employee) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.save(employee));
	}

	public ResponseEntity<Object> updateEmployee(Employee employee) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.save(employee));
	}

	public ResponseEntity<Object> deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Employee data deleted");
	}

	public ResponseEntity<Object> getAllEmployee() {
		List<Employee> employee = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee1 -> employee.add(employee1));
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}

	public ResponseEntity<Object> getEmployeeByID(int id) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepository.findById(id));
	}

	
	
	
	
}
