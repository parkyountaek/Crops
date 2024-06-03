package com.crops.managment.domain.model.valueobjct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Range {
    private UnitType unit;
    private Double from;
    private Double to;
}
