package com.sumit.crm.dto.client;

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
    private String callRecordingUrl;
    private String chatScreenshotUrl;
    private LocalDateTime createdAt;
    private List<LocalDateTime> contactedOn = new ArrayList<>();
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
        this.callRecordingUrl = client.getCallRecordingUrl();
        this.chatScreenshotUrl = client.getChatScreenshotUrl();
        this.createdAt = client.getCreatedAt();
        this.contactedOn = client.getContactedOn();
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<LocalDateTime> getContactedOn() {
        return contactedOn;
    }

    public void setContactedOn(List<LocalDateTime> contactedOn) {
        this.contactedOn = contactedOn;
    }

    public LanguageModel getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(LanguageModel preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
}
