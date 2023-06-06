package com.example.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootCrud.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
