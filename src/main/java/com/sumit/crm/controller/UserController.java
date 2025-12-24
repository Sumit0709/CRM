package com.sumit.crm.controller;


import com.sumit.crm.dto.user.UserResponseDTO;
import com.sumit.crm.model.User;
import com.sumit.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("user")
    public ResponseEntity<?> createUser(@RequestBody User user){
//        System.out.println(user);
        UserResponseDTO response =  userService.saveUser(user);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("users")
    public ResponseEntity<?> getAllUsers(){
        List<UserResponseDTO> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("users/under")
    public ResponseEntity<?> getAllUsersUnderManager(@RequestParam Long managerId){
        List<UserResponseDTO> users = userService.getAllUsersUnderManager(managerId);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("users/manager_for")
    public ResponseEntity<?> getManagerForUser(@RequestParam Long userId){
        UserResponseDTO manager = userService.getManagerForUser(userId);
        return new ResponseEntity<>(manager, HttpStatus.OK);
    }
}
