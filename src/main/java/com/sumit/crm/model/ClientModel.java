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

    public ClientModel() {
    }

    public ClientModel(Long id, String clientName, String company, String email, String phone, String description, String callRecordingUrl, String chatScreenshotUrl, UserModel employee, LocalDateTime createdAt) {
        this.id = id;
        this.clientName = clientName;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.callRecordingUrl = callRecordingUrl;
        this.chatScreenshotUrl = chatScreenshotUrl;
        this.employee = employee;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ClientModel{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", callRecordingUrl='" + callRecordingUrl + '\'' +
                ", chatScreenshotUrl='" + chatScreenshotUrl + '\'' +
                ", employee=" + employee +
                ", createdAt=" + createdAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCallRecordingUrl() {
        return callRecordingUrl;
    }

    public void setCallRecordingUrl(String callRecordingUrl) {
        this.callRecordingUrl = callRecordingUrl;
    }

    public String getChatScreenshotUrl() {
        return chatScreenshotUrl;
    }

    public void setChatScreenshotUrl(String chatScreenshotUrl) {
        this.chatScreenshotUrl = chatScreenshotUrl;
    }

    public UserModel getEmployee() {
        return employee;
    }

    public void setEmployee(UserModel employee) {
        this.employee = employee;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
