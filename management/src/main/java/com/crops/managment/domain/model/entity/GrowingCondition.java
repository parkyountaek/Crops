package com.crops.managment.domain.model.entity;

import com.crops.managment.domain.model.converter.RangeConverter;
import com.crops.managment.domain.model.entity.embeded.DateTimeBaseEntity;
import com.crops.managment.domain.model.valueobjct.Range;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "growing_condition")
public class GrowingCondition extends DateTimeBaseEntity { // 재배 조건
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID growingConditionId;

    @Convert(converter = RangeConverter.class)
    @Column(name = "temperature_range")
    private Range temperatureRange; // 적정 온도 범위

    @Convert(converter = RangeConverter.class)
    @Column(name = "humidity_range")
    private Range humidityRange; // 적정 습도 범위

    @Convert(converter = RangeConverter.class)
    @Column(name = "sunlight_hour")
    private Range sunlightHour; // 일조량

    @Column(name = "soil_type")
    private String soilType; // 적합한 토양 유형

    @Convert(converter = RangeConverter.class)
    @Column(name = "soil_ph_range")
    private Range soilPhRange; // 적정 PH 범위

    protected GrowingCondition(Range temperatureRange, Range humidityRange, Range sunlightHour, String soilType, Range soilPhRange) {
        this.temperatureRange = temperatureRange;
        this.humidityRange = humidityRange;
        this.sunlightHour = sunlightHour;
        this.soilType = soilType;
        this.soilPhRange = soilPhRange;
    }

    public static GrowingCondition create(Range temperatureRange, Range humidityRange, Range sunlightHour, String soilType, Range soilPhRange) {
        return new GrowingCondition(temperatureRange, humidityRange, sunlightHour, soilType, soilPhRange);
    }
}
