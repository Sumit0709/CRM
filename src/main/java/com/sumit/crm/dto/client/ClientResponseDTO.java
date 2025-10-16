package com.sumit.crm.dto.client;

import com.sumit.crm.model.ClientContactHistory;
import com.sumit.crm.model.ClientModel;
import com.sumit.crm.model.LanguageModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClientResponseDTO {

    private Long id;
    private String clientName;
    private String company;
    private String email;
    private String phone;
    private String description;
    private Long employeeId;
    private LocalDateTime createdAt;
    private List<ClientContactHistory> contactHistory = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private LanguageModel preferredLanguage;

    public ClientResponseDTO() {
    }

    public ClientResponseDTO(ClientModel client) {
        this.id = client.getId();
        this.clientName = client.getClientName();
        this.company = client.getCompany();
        this.email = client.getEmail();
        this.phone = client.getPhone();
        this.description = client.getDescription();
        this.employeeId = client.getEmployee() != null? client.getEmployee().getId(): null;
        this.createdAt = client.getCreatedAt();
        this.contactHistory = client.getContactHistory();
        this.preferredLanguage = client.getPreferredLanguage();
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

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public LanguageModel getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(LanguageModel preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public List<ClientContactHistory> getContactHistory() {
        return contactHistory;
    }

    public void setContactHistory(List<ClientContactHistory> contactHistory) {
        this.contactHistory = contactHistory;
    }
}
