package com.crop.application.crop.application.command.port

import com.crop.application.crop.application.command.dto.CropCreateCommand
import com.crop.application.crop.domain.model.entity.CropEntity

interface CropCreateUseCase {
    fun createCrop(command: CropCreateCommand): CropEntity
}