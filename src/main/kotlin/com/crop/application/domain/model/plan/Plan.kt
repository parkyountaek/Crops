package com.crop.application.domain.model.plan

import com.crop.application.domain.model.user.Role
import com.crop.application.domain.model.user.User

class Plan(
  val planId: Long? = null,
  var title: String,
  var content: String,
  var imgPath: MutableList<String>,
  var user: User
) {

  companion object {
    fun createPlan(command: CreatePlanCommand): Plan {
      val user = command.user
      if (Role.TEAM_LEADER == user.role) {
        return Plan(title = command.title, content = command.content, imgPath = command.imgPath, user = user)
      }
      throw RuntimeException("Not Accept")
    }
  }

  fun updatePlan(command: UpdatePlanCommand) {
    val user = command.user
    if (Role.TEAM_LEADER == user.role) {
      this.title = command.title
      this.content = command.content
      this.imgPath = command.imgPath
      this.user = user
    }
    throw RuntimeException("Not Accept")
  }
}