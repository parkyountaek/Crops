package com.crops.managment.domain.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "growing_condition")
public class GrowingCondition { // 재배 조건
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID growingConditionId;

    @Column(name = "temperature_range")
    private String temperatureRange; // 적정 온도 범위

    @Column(name = "humidity_range")
    private String humidityRange; // 적정 습도 범위

    @Column(name = "sunlight_hour")
    private Integer sunlightHour; // 일조량

    @Column(name = "soil_type")
    private String soilType; // 적합한 토양 유형

    @Column(name = "soil_ph_range")
    private String soilPhRange; // 적정 PH 범위
}
