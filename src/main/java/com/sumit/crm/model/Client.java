package com.sumit.crm.model;


import com.sumit.crm.model.type.ClientSource;
import com.sumit.crm.model.type.ClientStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(
        name = "client"
)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private ClientStatus status;

    @Enumerated(EnumType.STRING)
    private ClientSource source;

    @Column(name="brief_description")
    private String briefDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_to_employee")
    @ToString.Exclude
    private Employee assignedTo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_company")
    @ToString.Exclude
    private ClientCompany clientCompany;

    @OneToOne
    private Leads convertedFromLead;

    private LocalDateTime onboardedAt;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
