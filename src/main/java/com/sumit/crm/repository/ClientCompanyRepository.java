package com.sumit.crm.repository;

import com.sumit.crm.model.ClientCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientCompanyRepository extends JpaRepository<ClientCompany, Long> {
}
