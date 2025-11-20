package com.sumit.crm.repository;

import com.sumit.crm.model.Client;
import com.sumit.crm.model.ClientCompany;
import com.sumit.crm.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByAssignedTo(Users user);

    List<Client> findByClientCompany(ClientCompany clientCompany);
}
