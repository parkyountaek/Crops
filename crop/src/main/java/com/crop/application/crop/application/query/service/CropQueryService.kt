package com.crop.application.crop.application.query.service

import com.crop.application.crop.application.query.port.CropQueryUseCase
import com.crop.application.crop.domain.model.entity.CropEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class CropQueryService: CropQueryUseCase {
    override fun getById(cropId: Long): CropEntity {
        TODO("Not yet implemented")
    }
}