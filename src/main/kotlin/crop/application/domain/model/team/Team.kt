package crop.application.domain.model.team

import crop.application.domain.model.user.User

class Team(val teamId: Long?,
           val users: MutableSet<User>) {
  companion object {
    fun createTeam(user: User): Team {
      return Team(null, mutableSetOf(user))
    }
  }

  fun joinTeam(user: User) {
    this.users.add(user)
  }

  fun outTeam(user: User) {
    val find = this.users.first { it.userId == user.userId }
    this.users.remove(find)
  }

  fun toEntity() {
    TODO()
  }
}