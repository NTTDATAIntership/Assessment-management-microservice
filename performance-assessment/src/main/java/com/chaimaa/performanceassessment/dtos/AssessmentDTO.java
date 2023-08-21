package com.chaimaa.performanceassessment.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssessmentDTO {
    private Long employeeId;
    private Long evaluatorId;
    private int scores;
    private String comments;
}

