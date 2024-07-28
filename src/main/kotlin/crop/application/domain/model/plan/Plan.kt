package crop.application.domain.model.plan

import crop.application.domain.model.user.Role
import crop.application.domain.model.user.User

class Plan(val planId: Long?,
  var title: String,
  var content: String,
  var imgPath: MutableList<String>,
  var user: User
) {

  companion object {
    fun createPlan(title: String, content: String, imgPath: MutableList<String>, user: User): Plan {
      if (Role.TEAM_LEADER == user.role) {
        return Plan(null, title, content, imgPath, user)
      }
      throw RuntimeException("Not Accept")
    }
  }

  fun updatePlan(title: String, content: String, imgPath: MutableList<String>, user: User) {
    if (Role.TEAM_LEADER == user.role) {
      this.title = title
      this.content = content
      this.imgPath = imgPath
      this.user = user
    }
    throw RuntimeException("Not Accept")
  }
}