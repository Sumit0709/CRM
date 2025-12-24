package com.sumit.crm.service;

import com.sumit.crm.dto.leads.LeadsResponseDTO;
import com.sumit.crm.exception.customException.EntityNotFoundException;
import com.sumit.crm.model.Leads;
import com.sumit.crm.repository.LeadsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadsService {

    @Autowired
    private LeadsRepository leadsRepository;

    public LeadsResponseDTO getLeadetails(Long leadId) {
        Leads lead = leadsRepository.findById(leadId).orElse(null);

        if(lead == null){
            throw new EntityNotFoundException("Lead with id "+ leadId + " does not exist");
        }

        return new LeadsResponseDTO(lead);
    }


}
