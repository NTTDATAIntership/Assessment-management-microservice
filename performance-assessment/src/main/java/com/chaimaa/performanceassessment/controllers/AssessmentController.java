package com.chaimaa.performanceassessment.controllers;


import com.chaimaa.performanceassessment.dtos.AssessmentDTO;
import com.chaimaa.performanceassessment.entities.Assessment;
import com.chaimaa.performanceassessment.services.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assessments")
@RequiredArgsConstructor
public class AssessmentController {
    private final AssessmentService assessmentService;


    @PostMapping
    public ResponseEntity<Assessment> createAssessment(@RequestBody AssessmentDTO assessmentDTO) {
        Assessment assessment = assessmentService.createAssessment(assessmentDTO);
        return ResponseEntity.ok(assessment);
    }
    @GetMapping("/existsfromassessment/{id}")
    public ResponseEntity<Boolean> checkIfEmployeeExists(@PathVariable Long id) {
        boolean exists = assessmentService.checkIfEmployeeExists(id);
        return ResponseEntity.ok(exists);
    }
}
