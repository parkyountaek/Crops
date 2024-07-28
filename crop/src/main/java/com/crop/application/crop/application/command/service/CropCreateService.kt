package com.crop.application.crop.application.command.service

import com.crop.application.crop.application.command.dto.CropCreateCommand
import com.crop.application.crop.application.command.port.CropCreateUseCase
import com.crop.application.crop.domain.model.entity.CropEntity
import com.crop.application.crop.domain.repository.CropRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CropCreateService(val cropRepository: CropRepository): CropCreateUseCase {
    override fun createCrop(command: CropCreateCommand): CropEntity {
        val entity: CropEntity = CropEntity.create(command.name, command.userId)
        return cropRepository.save(entity)
    }
}