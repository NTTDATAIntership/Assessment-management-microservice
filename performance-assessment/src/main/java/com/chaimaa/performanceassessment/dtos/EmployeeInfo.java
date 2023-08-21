package com.chaimaa.performanceassessment.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfo {
    private Long id;
    private String firstname;
    private String lastname;
    private String jobTitle;
}
