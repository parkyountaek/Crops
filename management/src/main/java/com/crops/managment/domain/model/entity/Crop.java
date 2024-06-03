package com.crops.managment.domain.model.entity;

import com.crops.managment.domain.model.entity.embeded.DateTimeBaseEntity;
import com.crops.managment.domain.model.valueobjct.CropType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "crops")
@ToString
public class Crop extends DateTimeBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "crop_id", updatable = false, nullable = false)
    private UUID cropId;

    @Column(name = "name", nullable = false)
    private String name;

    private CropType cropType;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "cro_id")
    private Set<GrowingCondition> growingConditions;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "cro_id")
    private Set<GrowthStageHistory> growthStageHistories;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "cro_id")
    private Set<PestsDisease> pestsDiseases;

    public void addGrowthStageHistory(GrowingCondition growingCondition) {
        this.growingConditions.add(growingCondition);
    }

    private Crop(String name, CropType cropType) {
        this.name = name;
        this.cropType = cropType;
        this.growingConditions = new HashSet<>();
        this.growthStageHistories = new HashSet<>();
        this.pestsDiseases = new HashSet<>();
    }

    public static Crop create(String name, String scientificName, String family, String genus, String species) {
        return new Crop(name, new CropType(scientificName, family, genus, species));
    }
}