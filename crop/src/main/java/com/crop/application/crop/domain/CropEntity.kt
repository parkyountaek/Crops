package com.crop.application.crop.domain

import com.crop.application.crop.domain.embeded.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "crops")
class CropEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "crop_id")
    val cropId: Long,
    @Column(name = "name")
    val name: String,
    @Column(name = "user_id")
    val userId: Long) : BaseEntity() {
}