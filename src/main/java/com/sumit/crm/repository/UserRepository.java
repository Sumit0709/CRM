package com.sumit.crm.repository;


import com.sumit.crm.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findByManager(User manager);

    Optional<User> findByEmail(String email);
//    Optional<User> findByUsername(String username);
//
//
//    @Transactional
//    @Modifying
//    @Query("UPDATE UserModel u SET u.reportsTo.id = :supervisorId WHERE u.id = :userId")
//    int updateUserReporting(Long userId, Long supervisorId);
}
