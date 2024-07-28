package com.crop.application.crop.domain.model.entity

import com.crop.application.crop.domain.model.entity.embeded.UpdateBaseEntity
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
    val cropId: Long? = null,
    @Column(name = "name")
    val name: String,
    @Column(name = "user_id")
    val userId: Long) : UpdateBaseEntity() {

        companion object {
            fun create(name: String, userId: Long): CropEntity {
                return CropEntity(null, name, userId)
            }
        }
}