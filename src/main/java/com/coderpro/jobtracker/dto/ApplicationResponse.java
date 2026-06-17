package com.coderpro.jobtracker.dto;

import com.coderpro.jobtracker.enums.ApplicationStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class ApplicationResponse {
    private Long id;
    private String company;
    private String role;
    private ApplicationStatus status;
    private LocalDate appliedDate;
    private String notes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
