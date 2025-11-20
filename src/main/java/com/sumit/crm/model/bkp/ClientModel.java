//package com.sumit.crm.model.bkp;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "clients")
//public class ClientModel {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String clientName;
//    private String company;
//    private String email;
//    private String phone;
//
//    private String description;
//
//    @Enumerated(EnumType.STRING)
//    private LanguageModel preferredLanguage;
//
//
//    @ManyToOne
//    @JoinColumn(name = "employee_id")
//    private UserModel employee;
//
//    private LocalDateTime createdAt;
//
//    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
//    private List<ClientContactHistory> contactHistory = new ArrayList<>();
//
//    public ClientModel() {
//    }
//
//    public ClientModel(Long id, String clientName, String company, String email, String phone, String description, LanguageModel preferredLanguage, UserModel employee, LocalDateTime createdAt, List<ClientContactHistory> contactHistory) {
//        this.id = id;
//        this.clientName = clientName;
//        this.company = company;
//        this.email = email;
//        this.phone = phone;
//        this.description = description;
//        this.preferredLanguage = preferredLanguage;
//        this.employee = employee;
//        this.createdAt = createdAt;
//        this.contactHistory = contactHistory;
//    }
//
//    @Override
//    public String toString() {
//        return "ClientModel{" +
//                "id=" + id +
//                ", clientName='" + clientName + '\'' +
//                ", company='" + company + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", description='" + description + '\'' +
//                ", preferredLanguage=" + preferredLanguage +
//                ", employee=" + employee +
//                ", createdAt=" + createdAt +
//                ", contactHistory=" + contactHistory +
//                '}';
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
//    public String getClientName() {
//        return clientName;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
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
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public UserModel getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(UserModel employee) {
//        this.employee = employee;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LanguageModel getPreferredLanguage() {
//        return preferredLanguage;
//    }
//
//    public void setPreferredLanguage(LanguageModel preferredLanguage) {
//        this.preferredLanguage = preferredLanguage;
//    }
//
//    public List<ClientContactHistory> getContactHistory() {
//        return contactHistory;
//    }
//
//    public void setContactHistory(List<ClientContactHistory> contactHistory) {
//        this.contactHistory = contactHistory;
//    }
//}
