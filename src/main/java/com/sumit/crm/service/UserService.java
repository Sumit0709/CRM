package com.sumit.crm.service;

import com.sumit.crm.dto.user.AllUserResponseDTO;
import com.sumit.crm.model.UserModel;
import com.sumit.crm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<AllUserResponseDTO> getAllUsers(){
        List<AllUserResponseDTO> users = new ArrayList<>();

        try{
            users = userRepository
                    .findAll()
                    .stream()
                    .map(userModel -> {
//                    userModel.set
                        AllUserResponseDTO responseDTO = new AllUserResponseDTO(userModel);
                        return responseDTO;
                    })
                    .collect(Collectors.toList());
        }
        catch (Exception e){
            System.out.println("Error while getting all users :: " + e.toString());
        }

        return users;
    }

    public UserModel saveUser(UserModel user){
        UserModel savedUser = new UserModel();
        try{
            savedUser = userRepository.save(user);
        }
        catch (Exception e){

        }
        return savedUser;
    }

    public Boolean deleteUser(long userId) {

        Optional<UserModel> user = userRepository.findById(userId);
        if(user.isPresent()){
            try {
                userRepository.deleteById(userId);
                return true;
            }
            catch (Exception e){
                System.out.println("Exception while deleting user :: " + e.toString());
                return false;
            }
        }
        else{
            return false;
        }

    }

    public int updateUserReporting(Long userId, Long supervisorId) {

        Optional<UserModel> user = userRepository.findById(userId);
        if(user.isPresent()){
            try {
                return userRepository.updateUserReporting(userId, supervisorId);
            }
            catch (Exception e){
                System.out.println("Exception while deleting user :: " + e.toString());
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
