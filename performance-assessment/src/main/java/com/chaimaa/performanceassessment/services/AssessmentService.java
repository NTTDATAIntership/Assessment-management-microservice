package com.chaimaa.performanceassessment.services;

import com.chaimaa.performanceassessment.dtos.AssessmentDTO;
import com.chaimaa.performanceassessment.entities.Assessment;
import com.chaimaa.performanceassessment.repositories.AssessmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AssessmentService {

    private final AssessmentRepository assessmentRepository;


    public Assessment createAssessment(AssessmentDTO assessmentDTO) {
        Assessment assessment = new Assessment();
        assessment.setEmployeeId(assessmentDTO.getEmployeeId());
        assessment.setEvaluatorId(assessmentDTO.getEvaluatorId());
        assessment.setScores(assessmentDTO.getScores());
        assessment.setComments(assessmentDTO.getComments());
        assessment.setDate(LocalDate.now());
        return assessmentRepository.save(assessment);
    }
}
