package com.sumit.crm.service;


import com.sumit.crm.exception.customException.client.ClientNotFoundException;
import com.sumit.crm.model.Client;
import com.sumit.crm.model.Employee;
import com.sumit.crm.model.User;
import com.sumit.crm.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    public Employee getEmployeeAssignedToClient(Long clientId){
        Client client = clientRepository.findById(clientId).orElseThrow(() -> new ClientNotFoundException("Client does not exist."));
        Employee employee = client.getAssignedTo();
        return employee;
    }
}
