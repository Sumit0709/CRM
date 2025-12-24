package com.sumit.crm.exception.customException.employee;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message){ super(message); }
}
