package com.crops.managment.domain.model.valueobjct;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum UnitType {
    PH("pH"),
    HOUR("H"),
    TEMPERATURE_C("°C"),
    PERCENTAGE("%");

    private final String unit;

    public static UnitType valueOfOrNull(String unit) {
        return Arrays.stream(UnitType.values())
                .filter(it -> it.getUnit().equals(unit))
                .findFirst()
                .orElse(null);
    }
}
