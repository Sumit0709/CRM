package com.sumit.crm.service;


import com.sumit.crm.exception.customException.user.UserNotFoundException;
import com.sumit.crm.model.Client;
import com.sumit.crm.model.Users;
import com.sumit.crm.repository.ClientRepository;
import com.sumit.crm.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ClientRepository clientRepository;

    public List<Users> getAllUsers(){
        List<Users> users = userRepository.findAll();
        return users;
    }

    @Transactional
    public List<Users> getAllUsersUnderManager(Long managerId) throws RuntimeException{
        Users manager = userRepository.findById(managerId).orElseThrow(() -> new UserNotFoundException("User does not exist."));

        List<Users> users = userRepository.findByManager(manager);
        return users;
    }

    @Transactional
    public Users getManager(Long userId){
        Users user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User does not exist."));
        Users manager = userRepository.findById(user.getManager().getId()).orElseThrow(() -> new UserNotFoundException("Manager does not exist."));

        return manager;
    }

    @Transactional
    public List<Client> getAllClientsAssignedToUser(Long userId){
        Users user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User does not exist."));
        List<Client> clients = clientRepository.findByAssignedTo(user);
//                user.getClients();
        return clients;
    }


}
