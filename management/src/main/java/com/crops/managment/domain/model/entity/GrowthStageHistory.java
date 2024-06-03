package com.crops.managment.domain.model.entity;

import com.crops.managment.domain.model.entity.embeded.DateTimeBaseEntity;
import com.crops.managment.domain.model.valueobjct.GrowthStage;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "growth_stages")
public class GrowthStageHistory extends DateTimeBaseEntity { // 농작물 재배 단계
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID growthStageId;

    @Enumerated(EnumType.STRING)
    @Column(name = "growth_stage", nullable = false)
    private GrowthStage stageName;

    @Column(name = "start_date", columnDefinition = "date")
    private Date startDate;

    @Column(name = "end_date", columnDefinition = "date")
    private Date endDate;

    @Column(name = "tasks", columnDefinition = "varchar(max)")
    private String task;
}
