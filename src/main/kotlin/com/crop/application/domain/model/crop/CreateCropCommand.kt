package com.crop.application.domain.model.crop

data class CreateCropCommand(
  val name: String,
  val userId: Long
)
