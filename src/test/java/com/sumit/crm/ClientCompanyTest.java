package com.sumit.crm;

import com.sumit.crm.model.Client;
import com.sumit.crm.service.ClientCompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ClientCompanyTest {

    @Autowired
    private ClientCompanyService clientCompanyService;

    @Test
    public void testGetAllClientsFromCompany(){
        Long clientCompanyId = 1L;
        List<Client> clients = clientCompanyService.getAllClientsFromCompany(clientCompanyId);
        for(Client c: clients){
            System.out.println(c);
        }
    }
}
