package com.sumit.crm.service;


import com.sumit.crm.exception.customException.clientCompany.ClientCompanyNotFoundException;
import com.sumit.crm.model.Client;
import com.sumit.crm.model.ClientCompany;
import com.sumit.crm.repository.ClientCompanyRepository;
import com.sumit.crm.repository.ClientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientCompanyService {

    private final ClientCompanyRepository clientCompanyRepository;
    private final ClientRepository clientRepository;

    public List<ClientCompany> getAllClientCompany(){
        return clientCompanyRepository.findAll();
    }

    @Transactional
    public List<Client> getAllClientsFromCompany(Long clientCompanyId){
        ClientCompany clientCompany = clientCompanyRepository.findById(clientCompanyId).orElseThrow(() -> new ClientCompanyNotFoundException("Company does not exist"));
        List<Client> clients = clientRepository.findByClientCompany(clientCompany);
        return clients;
    }
}
