package com.sumit.crm.repository;

import com.sumit.crm.model.ReportModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReportRepository extends JpaRepository<ReportModel, Long> {
    List<ReportModel> findByEmployeeIdAndDateBetween(Long employeeId, LocalDate start, LocalDate end);
}
