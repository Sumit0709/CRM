package com.sumit.crm.repository;

import com.sumit.crm.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    List<ClientModel> findByEmployeeId(Long employeeId);
}
