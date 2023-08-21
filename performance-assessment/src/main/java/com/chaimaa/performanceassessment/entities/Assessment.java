package com.chaimaa.performanceassessment.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "assessmentS")
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private Long evaluatorId;

    private int scores;
    private String comments;
    private LocalDate date;

    public Assessment(Long employeeId, Long evaluatorId, int scores, String comments, LocalDate date) {
        this.employeeId = employeeId;
        this.evaluatorId = evaluatorId;
        this.scores = scores;
        this.comments = comments;
        this.date = date;
    }

    public Assessment() {
    }
}
