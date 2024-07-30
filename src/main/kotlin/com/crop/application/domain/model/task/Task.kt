package com.crop.application.domain.model.task

class Task(
  val workId: Long? = null,
  val planId: Long? = null,
  var content: String,
  var imgPaths: MutableList<String>,
) {
  companion object {
    fun createTask(planId: Long, content: String, imgPaths: MutableList<String>): Task {
      return Task(planId = planId, content = content, imgPaths = imgPaths)
    }
  }

  fun updateWork() {
    TODO()
  }
}