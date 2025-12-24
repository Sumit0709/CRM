package com.sumit.crm.controller;

import com.sumit.crm.dto.leads.LeadsResponseDTO;
import com.sumit.crm.service.LeadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leads")
public class LeadsController {

    @Autowired
    private LeadsService leadsService;

    @GetMapping("/{leadId}")
    public ResponseEntity<?> getLeadDetails(@PathVariable Long leadId){
        LeadsResponseDTO leadsResponseDTO = leadsService.getLeadetails(leadId);

        return new ResponseEntity<LeadsResponseDTO>(leadsResponseDTO,HttpStatus.OK);
    }

//    @PostMapping("/")
//    public ResponseEntity<?> createNewLead(@RequestBody Lead){
//        LeadsResponseDTO leadsResponseDTO = leadsService.getLeadetails(leadId);
//
//        return new ResponseEntity<LeadsResponseDTO>(leadsResponseDTO,HttpStatus.OK);
//    }

}
