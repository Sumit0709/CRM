package com.sumit.crm.controller;

import com.sumit.crm.dto.client.ClientResponseDTO;
import com.sumit.crm.dto.user.UpdateReportingDTO;
import com.sumit.crm.dto.user.AllUserResponseDTO;
import com.sumit.crm.model.UserModel;
import com.sumit.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService us;

    @GetMapping("user")
    public List<AllUserResponseDTO> getUser(){
        List<AllUserResponseDTO> users = us.getAllUsers();
        return users;

    }

    @PostMapping("user")
    public UserModel createUser(@RequestBody UserModel user){

        return us.saveUser(user);
    }

    @DeleteMapping("user")
    public ResponseEntity<String> deleteUser(@RequestParam long userId){
        Boolean isUserDeleted = us.deleteUser(userId);
        if(isUserDeleted){
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Deletion failed");
        }
    }

    @PutMapping("user-reporting")
    public ResponseEntity<String> updateUserReporting(@RequestBody UpdateReportingDTO reportingDto){

        int updatedUserCount = us.updateUserReporting(reportingDto.getUserId(), reportingDto.getSupervisorId());

        if(updatedUserCount == 0){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Update failed.");
        }
        else{
            return ResponseEntity.status(HttpStatus.OK).body("Successfully updated.");
        }
    }

    @GetMapping("user-subordinates")
    public List<AllUserResponseDTO> getUserSubordinates(@RequestParam Long userId){

        List<AllUserResponseDTO> users = us.getSubordinates(userId);
        return users;

    }

    @GetMapping("user-clients")
    public ResponseEntity<List<ClientResponseDTO>> getAllClientsHandledByUser(@RequestParam Long userId){

        List<ClientResponseDTO> clients = us.getAllClients(userId);
        if (clients == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok().body(clients);
    }


}
