package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.Employee;
import java.util.List;

public interface EmployeeService {
 List<Employee> getAll();
 Employee getEmployeeDetail(int id);
 Employee saveDetails(Employee e);

 Boolean deleteEmployee(int id);


 Employee putEmployee(Employee e);
}
