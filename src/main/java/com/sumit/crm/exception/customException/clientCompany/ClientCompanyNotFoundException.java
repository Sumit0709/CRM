package com.sumit.crm.exception.customException.clientCompany;

public class ClientCompanyNotFoundException extends RuntimeException{
    public ClientCompanyNotFoundException(String message){
        super(message);
    }
}
