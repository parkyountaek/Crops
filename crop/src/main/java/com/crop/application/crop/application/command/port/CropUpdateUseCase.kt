package com.crop.application.crop.application.command.port

import com.crop.application.crop.application.command.dto.CropUpdateCommand
import com.crop.application.crop.domain.model.entity.CropEntity

interface CropUpdateUseCase {
    fun updateCrop(command: CropUpdateCommand): CropEntity
}