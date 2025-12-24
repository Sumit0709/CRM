package com.sumit.crm.exception.customException.employee;

public class InvalidEmployeeRequestBody extends RuntimeException{
    public InvalidEmployeeRequestBody(String message){ super(message); }
}
