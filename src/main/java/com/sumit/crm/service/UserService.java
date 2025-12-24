package com.sumit.crm.service;


import com.sumit.crm.dto.employee.EmployeeResponseDTO;
import com.sumit.crm.dto.user.UserResponseDTO;
import com.sumit.crm.exception.customException.user.UserException;
import com.sumit.crm.exception.customException.user.UserNotFoundException;
import com.sumit.crm.model.Client;
import com.sumit.crm.model.User;
import com.sumit.crm.repository.ClientRepository;
import com.sumit.crm.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ClientRepository clientRepository;

    public List<UserResponseDTO> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> new UserResponseDTO(user))
                .toList();
    }

//    TODOD ::
    @Transactional
    public List<UserResponseDTO> getAllUsersUnderManager(Long managerId) throws RuntimeException{
//        User manager = userRepository.findById(managerId).orElseThrow(() -> new UserNotFoundException("User does not exist."));

//        List<User> users = userRepository.findByManager(manager);
//        return users.stream().map(user -> new UserResponseDTO(user)).toList();
        return new ArrayList<>();
    }

    //    TODOD ::
    @Transactional
    public UserResponseDTO getManagerForUser(Long userId){
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User does not exist."));
//        User manager = userRepository.findById(user.getManager().getId()).orElseThrow(() -> new UserNotFoundException("Manager does not exist."));

        return new UserResponseDTO(user);
    }

    //    TODOD ::
    @Transactional
    public List<Client> getAllClientsAssignedToUser(Long userId){
//        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User does not exist."));
//        List<Client> clients = clientRepository.findByAssignedTo(user);
//                user.getClients();
//        return clients;
        return new ArrayList<>();
    }

    @Transactional
    public UserResponseDTO saveUser(User user) {

        User savedUser  = userRepository.findByEmail(user.getEmail()).orElse(null);

        if(savedUser != null) {
            throw new UserException("User Already Exists!");
        }

//        try {
            savedUser = userRepository.save(user);
            return new UserResponseDTO(savedUser);
//        }
//        catch (Exception ex){
//            return null;
//        }

    }
}
