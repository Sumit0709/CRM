//package com.sumit.crm.dto.user;
//
//import com.sumit.crm.model.type.UserRole;
//import com.sumit.crm.model.bkp.UserModel;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//
//
//public class AllUserResponseDTO {
//    private Long id;
//    private String name;
//    private String email;
//    @Enumerated(EnumType.STRING)
//    private UserRole role;
//    private Long reportsToId;
//
//
//    // constructor
//    public AllUserResponseDTO(UserModel user) {
//        this.id = user.getId();
//        this.name = user.getName();
//        this.email = user.getEmail();
//        this.role = user.getRole();
//        this.reportsToId = user.getReportsTo() != null ? user.getReportsTo().getId() : null;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public UserRole getRole() {
//        return role;
//    }
//
//    public void setRole(UserRole role) {
//        this.role = role;
//    }
//
//    public Long getReportsToId() {
//        return reportsToId;
//    }
//
//    public void setReportsToId(Long reportsToId) {
//        this.reportsToId = reportsToId;
//    }
//}
