package com.crop.application.crop.application.command.dto

data class CropUpdateCommand(val cropId: Long,
                             val name: String,
                             val userId: Long)
