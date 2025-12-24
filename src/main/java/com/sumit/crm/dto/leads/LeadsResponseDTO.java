package com.sumit.crm.dto.leads;


import com.sumit.crm.model.Client;
import com.sumit.crm.model.Leads;
import com.sumit.crm.model.type.ClientSource;
import com.sumit.crm.model.type.ClientStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
public class LeadsResponseDTO {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private ClientStatus status;

    @Enumerated(EnumType.STRING)
    private ClientSource source;

    private String briefDescription;
    private Long convertedToClientId;
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public LeadsResponseDTO(Leads leads){
        this.id = leads.getId();
        this.firstName = leads.getFirstName();
        this.middleName = leads.getMiddleName();
        this.lastName = leads.getLastName();
        this.email = leads.getEmail();
        this.phone = leads.getPhone();
        this.status = leads.getStatus();
        this.source = leads.getSource();
        this.briefDescription = leads.getBriefDescription();
        this.convertedToClientId = leads.getConvertedToClient() != null ? leads.getConvertedToClient().getId(): null;
        this.createdAt = leads.getCreatedAt();
        this.updatedAt = leads.getUpdatedAt();
    }

}
