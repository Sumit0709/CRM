package com.sumit.crm.dto.user;

import com.sumit.crm.model.User;
import com.sumit.crm.model.type.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
//    private String firstName;
//    private String lastName;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRole role;
//    private Long managerId;


    // constructor
    public UserResponseDTO(User user) {
        this.id = user.getId();
//        this.firstName = user.getFirstName();
        this.email = user.getEmail();
        this.role = user.getRole();
//        this.managerId = user.getManager() != null ? user.getManager().getId() : null;
    }

}
