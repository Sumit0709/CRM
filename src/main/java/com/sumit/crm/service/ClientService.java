package com.sumit.crm.service;

import com.sumit.crm.dto.client.ClientResponseDTO;
import com.sumit.crm.dto.client.CreateClientDTO;
import com.sumit.crm.model.ClientModel;
import com.sumit.crm.model.UserModel;
import com.sumit.crm.repository.ClientRepository;
import com.sumit.crm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    UserRepository userRepository;

    public String saveClient(CreateClientDTO client){
        try {
            Long employeeId = client.getEmployeeId();
            UserModel employeeFound = null;

            if(employeeId != null) {
                // Check if assigned employee exist in user table
                employeeFound = userRepository.findById(employeeId).orElse(null);
                if(employeeFound == null){
                    return "Invalid employee!";
                }
            }

            LocalDateTime currentDT = LocalDateTime.now();

            ClientModel newClient = new ClientModel();
            newClient.setCreatedAt(currentDT);
            newClient.setClientName(client.getClientName());
            newClient.setCompany(client.getCompany());
            newClient.setDescription(client.getDescription());
            newClient.setEmail(client.getEmail());
            newClient.setPhone(client.getPhone());
            newClient.setEmployee(employeeFound);

            ClientModel savedClient = clientRepository.save(newClient);
            return "Client Saved";
        }
        catch(Exception e){
            System.out.println("Error while creating client :: " + e.toString());
            return "Error while creating client.";
        }
    }

    public List<ClientResponseDTO> getAllClients() {
        return clientRepository
                .findAll()
                .stream()
                .map(client -> new ClientResponseDTO(client))
                .collect(Collectors.toList());
    }

    public ClientResponseDTO getClientById(Long clientId) {

        try{
            ClientModel client = clientRepository
                    .findById(clientId)
                    .orElse(null);
//                    .orElseThrow(() -> new ResourceAccessException("Failed to fetch client"));

            if(client == null){
                return new ClientResponseDTO();
            }

            ClientResponseDTO clientResponse = new ClientResponseDTO(client);
            return clientResponse;
        }
        catch (Error e){
            System.out.println("Error while fetching Client bu Id " + e.toString());
            return null;
        }
    }
}
