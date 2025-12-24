package com.sumit.crm.dto.employee;

import com.sumit.crm.model.Employee;
import com.sumit.crm.model.User;
import com.sumit.crm.model.type.EmployeeRole;
import com.sumit.crm.model.type.EmployeeStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeResponseDTO {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private EmployeeRole role;
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

    private Long managerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    // constructor
    public EmployeeResponseDTO(Employee employee) {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.middleName = employee.getMiddleName();
        this.lastName = employee.getLastName();
        this.role = employee.getRole();
        this.status = employee.getStatus();
        this.managerId = employee.getManager() != null? employee.getManager().getId(): null;
        this.createdAt = employee.getCreatedAt();
        this.updatedAt = employee.getUpdatedAt();
    }
}
