//package com.sumit.crm.model.bkp;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "reports")
//public class ReportModel {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Override
//    public String toString() {
//        return "ReportModel{" +
//                "id=" + id +
//                ", date=" + date +
//                ", summary='" + summary + '\'' +
//                ", employee=" + employee +
//                ", reportType=" + reportType +
//                '}';
//    }
//
//    public ReportModel() {
//    }
//
//    public ReportModel(Long id, LocalDate date, String summary, UserModel employee, ReportType reportType) {
//        this.id = id;
//        this.date = date;
//        this.summary = summary;
//        this.employee = employee;
//        this.reportType = reportType;
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
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
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
//    public ReportType getReportType() {
//        return reportType;
//    }
//
//    public void setReportType(ReportType reportType) {
//        this.reportType = reportType;
//    }
//
//    private LocalDate date;
//    private String summary; // Daily or Weekly summary
//
//    @ManyToOne
//    @JoinColumn(name = "employee_id")
//    private UserModel employee;
//
//    @Enumerated(EnumType.STRING)
//    private ReportType reportType; // DAILY or WEEKLY
//}
