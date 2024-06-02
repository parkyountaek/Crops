package com.crops.managment.domain.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pests_diseases")
public class PestsDisease { // 병해충 정보
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pestsDiseaseId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "varchar(max)")
    private String description;

    @Column(name = "treatment", columnDefinition = "varchar(max)")
    private String treatment;

    @Column(name = "occurrence_date", columnDefinition = "date")
    private Date occurrenceDate;

    @Column(name = "resolution_date", columnDefinition = "date")
    private Date resolutionDate;
}