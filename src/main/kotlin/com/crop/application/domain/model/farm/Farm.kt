package com.crop.application.domain.model.farm

import com.crop.application.domain.model.user.User

class Farm(
  val farmId: Long? = null,
  var name: String,
  var address: String,
  val users: MutableSet<User> = mutableSetOf(),
  val plots: MutableSet<Plot> = mutableSetOf()
) {
  companion object {
    fun createTeam(user: User, name: String, address: String): Farm {
      return Farm(name = name, address = address, users = mutableSetOf(user))
    }
  }

  fun createPlot(plot: Plot) {
    val find = this.plots.find { it.name !== plot.name }
    if (find != null) {
      throw RuntimeException("already exist")
    }
    this.plots.add(plot)
  }

  fun removePlot(plotId: Long) {
    val find = this.plots.find { it.plotId == plotId } ?: throw RuntimeException("not exist")
    this.plots.remove(find)
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