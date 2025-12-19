package com.sumit.crm.repository;

import com.sumit.crm.model.ClientRecordingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRecordingDetailsRepository extends JpaRepository<ClientRecordingDetails, Long> {
}
