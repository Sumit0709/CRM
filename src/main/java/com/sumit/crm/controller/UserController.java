package com.sumit.crm.controller;


import com.sumit.crm.model.Users;
import com.sumit.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("users")
    public ResponseEntity<?> getAllUsers(){
        List<Users> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("users/manager")
    public ResponseEntity<?> getAllUsersUnderManager(@RequestParam Long managerId){
//        Long managerId = 9L;
        List<Users> users = userService.getAllUsersUnderManager(managerId);
        System.out.println("USERS under manager "+managerId);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
