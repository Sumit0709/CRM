//package com.sumit.crm.model.bkp;
//
//import com.sumit.crm.model.type.UserRole;
//import jakarta.persistence.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "users")
//public class UserModel {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    @Column(unique = true, nullable = false)
//    private String email;
//    private String password;
//
//
//    @ManyToOne
//    @JoinColumn(name = "reports_to_id") // foreign key column in the user table
//    private UserModel reportsTo;
//
//    @OneToMany(mappedBy = "reportsTo")
//    private List<UserModel> subordinates = new ArrayList<>();
//
//    @Enumerated(EnumType.STRING)
//    private UserRole role; // EMPLOYEE, MANAGER, ADMIN
//
//    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
//    private List<ClientModel> clients = new ArrayList<>();
//
//    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
//    private List<ReportModel> reports = new ArrayList<>();
//
//    public void addClient(ClientModel client) {
//        this.clients.add(client);
//        client.setEmployee(this);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "UserModel{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", reportsTo=" + reportsTo +
//                ", subordinates=" + subordinates +
//                ", role=" + role +
//                ", clients=" + clients +
//                ", reports=" + reports +
//                '}';
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
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public UserModel getReportsTo() {
//        return reportsTo;
//    }
//
//    public void setReportsTo(UserModel reportsTo) {
//        this.reportsTo = reportsTo;
//    }
//
//    public List<UserModel> getSubordinates() {
//        return subordinates;
//    }
//
//    public void setSubordinates(List<UserModel> subordinates) {
//        this.subordinates = subordinates;
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
//    public List<ClientModel> getClients() {
//        return clients;
//    }
//
//    public void setClients(List<ClientModel> clients) {
//        this.clients = clients;
//    }
//
//    public List<ReportModel> getReports() {
//        return reports;
//    }
//
//    public void setReports(List<ReportModel> reports) {
//        this.reports = reports;
//    }
//
//    public UserModel(Long id, String name, String email, String password, UserModel reportsTo, List<UserModel> subordinates, UserRole role, List<ClientModel> clients, List<ReportModel> reports) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.reportsTo = reportsTo;
//        this.subordinates = subordinates;
//        this.role = role;
//        this.clients = clients;
//        this.reports = reports;
//    }
//
//    public UserModel() {
//    }
//
//}
//
