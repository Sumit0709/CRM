package com.sumit.crm.controller;


import com.sumit.crm.dto.user.UserResponseDTO;
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
