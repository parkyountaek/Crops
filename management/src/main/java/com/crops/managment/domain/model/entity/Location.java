package com.crops.managment.domain.model.entity;

import com.crops.managment.domain.model.entity.embeded.DateTimeBaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "locations")
public class Location extends DateTimeBaseEntity { // 재배 지역 정보
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
