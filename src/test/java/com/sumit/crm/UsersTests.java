package com.sumit.crm;


import com.sumit.crm.model.Client;
import com.sumit.crm.model.Users;
import com.sumit.crm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UsersTests {

    @Autowired
    private UserService userService;

    @Test
    public void testAllUsers(){
        List<Users> users = userService.getAllUsers();
        System.out.println("All users -");
        for(Users user: users)
            System.out.println(user);
    }

    @Test
    public void testGetAllUsersUnderManager(){
        Long managerId = 9L;
        try{
            List<Users> users = userService.getAllUsersUnderManager(managerId);
            System.out.println("USERS under manager "+managerId);
            for(Users user: users)
                System.out.println(user);
        }
        catch (Exception e){
            System.out.println("Exception :: "+e.getMessage());
        }
    }

    @Test
    public void testGetAllClientsAssignedToUser(){
        Long userId = 1L;
        try {
            List<Client> clients = userService.getAllClientsAssignedToUser(userId);
            for(Client client: clients)
                System.out.println(client);
        }
        catch (Exception e){
            System.out.println("Exception :: "+e.getMessage());
        }
    }
}
