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
@Table(name = "locations")
public class Location { // 재배 지역 정보
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID locationId;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "climate_date", columnDefinition = "varchar(max)")
    private String climateDate;

    @Column(name = "soilDate", columnDefinition = "varchar(max)")
    private String soilDate;
}
