package com.chaimaa.performanceassessment.services;

import com.chaimaa.performanceassessment.dtos.AssessmentDTO;
import com.chaimaa.performanceassessment.entities.Assessment;
import com.chaimaa.performanceassessment.repositories.AssessmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AssessmentService {

    private final AssessmentRepository assessmentRepository;
    private final WebClient webClient;


    public Assessment createAssessment(AssessmentDTO assessmentDTO) {
        Assessment assessment = new Assessment();
        assessment.setEmployeeId(assessmentDTO.getEmployeeId());
        assessment.setEvaluatorId(assessmentDTO.getEvaluatorId());
        assessment.setScores(assessmentDTO.getScores());
        assessment.setComments(assessmentDTO.getComments());
        assessment.setDate(LocalDate.now());
        return assessmentRepository.save(assessment);
    }
//    Boolean result = webClient.get()
//            .uri("http://localhost:9090/api/exists/1")
//            .retrieve()
//            .bodyToMono(Boolean.class)
//            .block();
    public Boolean checkIfEmployeeExists(Long employeeId) {
        return webClient
                .get()
                .uri("http://localhost:9090/api/exists/{id}", employeeId)
                .retrieve()
                .bodyToMono(Boolean.class).
                block();
    }
}
