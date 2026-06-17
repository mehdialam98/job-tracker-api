package com.coderpro.jobtracker.dto;

import com.coderpro.jobtracker.enums.ApplicationStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ApplicationRequest {
    @NotBlank(message = "Company is required")
    private String company;

    @NotBlank(message = "Role is required")
    private String role;

    @NotNull(message = "Status is required")
    private ApplicationStatus status;

    @NotNull(message = "Applied date is required")
    private LocalDate appliedDate;

    private String notes;  // optional, no constraint
}
