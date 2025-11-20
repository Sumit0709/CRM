//package com.sumit.crm.model.bkp;
//
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "client-contact-record")
//public class ClientContactHistory {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name = "client_id", nullable = false, referencedColumnName = "id")
//    private ClientModel client;
//
//    @ManyToOne
//    @JoinColumn(name = "employee_id", nullable = false, referencedColumnName = "id")
//    private UserModel employee;
//
//    private LocalDateTime contactedOn;
//    private String callRecordingUrl;
//    private String chatScreenshotUrl;
//
//    public ClientContactHistory(long id, ClientModel client, UserModel employee, LocalDateTime contactedOn, String callRecordingUrl, String chatScreenshotUrl) {
//        this.id = id;
//        this.client = client;
//        this.employee = employee;
//        this.contactedOn = contactedOn;
//        this.callRecordingUrl = callRecordingUrl;
//        this.chatScreenshotUrl = chatScreenshotUrl;
//    }
//
//    @Override
//    public String toString() {
//        return "ClientContactHistory{" +
//                "id=" + id +
//                ", client=" + client +
//                ", employee=" + employee +
//                ", contactedOn=" + contactedOn +
//                ", callRecordingUrl='" + callRecordingUrl + '\'' +
//                ", chatScreenshotUrl='" + chatScreenshotUrl + '\'' +
//                '}';
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public ClientModel getClient() {
//        return client;
//    }
//
//    public void setClient(ClientModel client) {
//        this.client = client;
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
//    public LocalDateTime getContactedOn() {
//        return contactedOn;
//    }
//
//    public void setContactedOn(LocalDateTime contactedOn) {
//        this.contactedOn = contactedOn;
//    }
//
//    public String getCallRecordingUrl() {
//        return callRecordingUrl;
//    }
//
//    public void setCallRecordingUrl(String callRecordingUrl) {
//        this.callRecordingUrl = callRecordingUrl;
//    }
//
//    public String getChatScreenshotUrl() {
//        return chatScreenshotUrl;
//    }
//
//    public void setChatScreenshotUrl(String chatScreenshotUrl) {
//        this.chatScreenshotUrl = chatScreenshotUrl;
//    }
//}
