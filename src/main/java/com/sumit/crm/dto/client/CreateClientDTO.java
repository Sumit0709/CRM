package com.sumit.crm.dto.client;

import com.sumit.crm.model.LanguageModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class CreateClientDTO {

    private String clientName;
    private String company;
    private String email;
    private String phone;
    private String description;
    private Long employeeId;

    @Enumerated(EnumType.STRING)
    private LanguageModel preferredLanguage;

    public CreateClientDTO(String clientName, String company, String email, String phone, String description, Long employeeId, LanguageModel preferredLanguage) {
        this.clientName = clientName;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.employeeId = employeeId;
        this.preferredLanguage = preferredLanguage;
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

    public LanguageModel getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(LanguageModel preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
}
