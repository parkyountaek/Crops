package com.crop.application.domain.model.plan

import com.crop.application.domain.model.user.User

data class UpdatePlanCommand(
  val title: String,
  val content: String,
  val imgPath: MutableList<String>,
  val user: User
)
