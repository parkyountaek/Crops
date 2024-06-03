package com.crops.managment.domain.model.valueobjct;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CropType {
    @Column(name = "scientific_name")
    private String scientificName; // 학명

    @Column(name = "family")
    private String family; // 과

    @Column(name = "genus")
    private String genus; // 속

    @Column(name = "species")
    private String species; // 종
}
