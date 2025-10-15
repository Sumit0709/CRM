package com.sumit.crm.repository;

import com.sumit.crm.model.UserModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByEmail(String email);


    @Transactional
    @Modifying
    @Query("UPDATE UserModel u SET u.reportsTo.id = :supervisorId WHERE u.id = :userId")
    int updateUserReporting(Long userId, Long supervisorId);

}