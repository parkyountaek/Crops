package com.crop.application.crop.application.command.service

import com.crop.application.crop.application.command.dto.CropUpdateCommand
import com.crop.application.crop.application.command.port.CropUpdateUseCase
import com.crop.application.crop.domain.model.entity.CropEntity
import com.crop.application.crop.domain.repository.CropRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CropUpdateService(val cropRepository: CropRepository): CropUpdateUseCase {
    override fun updateCrop(command: CropUpdateCommand): CropEntity {
        val entity: CropEntity = CropEntity(command.cropId, command.name, command.userId)
        return cropRepository.save(entity);
    }

}