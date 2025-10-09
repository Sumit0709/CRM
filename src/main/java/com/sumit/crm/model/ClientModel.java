package com.sumit.crm.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
public class ClientModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;
    private String company;
    private String email;
    private String phone;

    private String description;

    private String callRecordingUrl;
    private String chatScreenshotUrl;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private UserModel employee;

    private LocalDateTime createdAt;
}
