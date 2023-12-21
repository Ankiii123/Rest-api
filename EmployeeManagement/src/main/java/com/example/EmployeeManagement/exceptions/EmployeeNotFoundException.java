package com.example.EmployeeManagement.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }


}
