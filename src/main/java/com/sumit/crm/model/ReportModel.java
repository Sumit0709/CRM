package com.sumit.crm.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reports")
public class ReportModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String summary; // Daily or Weekly summary

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private UserModel employee;

    @Enumerated(EnumType.STRING)
    private ReportType reportType; // DAILY or WEEKLY
}
