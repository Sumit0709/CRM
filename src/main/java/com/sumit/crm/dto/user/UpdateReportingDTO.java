package com.sumit.crm.dto.user;

public class UpdateReportingDTO {
    private Long userId;
    private Long supervisorId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Long supervisorId) {
        this.supervisorId = supervisorId;
    }
}
