package com.chaimaa.performanceassessment.repositories;

import com.chaimaa.performanceassessment.entities.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
}
