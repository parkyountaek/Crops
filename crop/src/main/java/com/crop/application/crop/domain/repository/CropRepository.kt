package com.crop.application.crop.domain.repository

import com.crop.application.crop.domain.model.entity.CropEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CropRepository: JpaRepository<CropEntity, Long> {
}