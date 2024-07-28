package com.crop.application.crop.application.query.port

import com.crop.application.crop.domain.model.entity.CropEntity

interface CropQueryUseCase {
    fun getById(cropId: Long): CropEntity
}