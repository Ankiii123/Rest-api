
package com.example.EmployeeManagement;

import com.example.EmployeeManagement.exceptions.EmployeeNotFoundException;
import com.example.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
EmployeeRepository employeeRepository;
public List<Employee> getAll(){
return  employeeRepository.findAll();
}

    @Override
    public Employee getEmployeeDetail(int id) {
        Optional<Employee> empOpt=employeeRepository.findById(id);
        if(empOpt.isPresent()){
            return empOpt.get();
        }
       throw new EmployeeNotFoundException("employee not found!!!!");
    }

    @Override
    public Employee saveDetails(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public Boolean deleteEmployee(int id) {
        return null;
    }

    @Override
    public Employee putEmployee(Employee e){
    Optional<Employee> empOpt = employeeRepository.findById(e.getId());
    if(empOpt.isPresent()){
        Employee newRecord = empOpt.get();
        newRecord.setDesignation(e.getDesignation());
        newRecord.setName(e.getName());
        return employeeRepository.save(newRecord);
    }
        throw new EmployeeNotFoundException("employee not found!!!!");
    }




}
