package com.sumit.crm.controller;


import com.sumit.crm.dto.employee.EmployeeResponseDTO;
import com.sumit.crm.model.Employee;
import com.sumit.crm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        EmployeeResponseDTO savedEmployee =  employeeService.createEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.OK);
    }
}
