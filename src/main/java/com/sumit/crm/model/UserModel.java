package com.sumit.crm.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private RoleModel role; // EMPLOYEE, MANAGER, ADMIN

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<ClientModel> clients = new ArrayList<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<ReportModel> reports = new ArrayList<>();
}

