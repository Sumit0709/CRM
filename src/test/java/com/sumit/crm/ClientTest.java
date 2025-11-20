package com.sumit.crm;

import com.sumit.crm.model.Client;
import com.sumit.crm.model.Users;
import com.sumit.crm.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ClientTest {

    @Autowired
    private ClientService clientService;

    @Test
    public void testAllClient(){
        List<Client> clients = clientService.getAllClient();
        System.out.println("All Clients :: ");
        for(Client client : clients){
            System.out.println(client);
        }
    }

    @Test
    public void testGetUserAssignedToClient(){
        Long clientId = 4L;
        try {
            Users user = clientService.getUserAssignedToClient(clientId);
            System.out.println(user);
        }
        catch (Exception e){
            System.out.println("Exception :: " + e.getMessage());
        }

    }
}
