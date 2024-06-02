package com.crops.managment.domain.model.valueobjct;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GrowthStage {
    PREPARATION("준비 단계"),
    PLANTING("재배 단계"),
    GROWTH("성장 단계"),
    MANAGEMENT("관리 단계"),
    HARVEST("수확 단계"),
    COMPLETION("마무리 단계");

    private final String stageName;
}
