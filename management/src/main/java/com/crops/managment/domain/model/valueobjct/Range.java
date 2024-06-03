package com.crops.managment.domain.model.valueobjct;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor()
public class Range {
    private UnitType unit;
    private Double from;
    private Double to;

    public static Range createTemperatureRange(Double from, Double to) {
        return new Range(UnitType.TEMPERATURE_C, from, to);
    }

    public static Range createSunLightHour(Double from, Double to) {
        return new Range(UnitType.HOUR, from ,to);
    }

    public static Range createHumidityRange(Double from, Double to) {
        return new Range(UnitType.PERCENTAGE, from ,to);
    }

    public static Range createSoilPhRange(Double from, Double to) {
        return new Range(UnitType.PH, from ,to);
    }

}
