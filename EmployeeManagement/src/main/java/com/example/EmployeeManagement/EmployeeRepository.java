package com.example.EmployeeManagement;

import org.springframework.data.jpa.repository.JpaRepository;


//communicate between db and service
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {



}
