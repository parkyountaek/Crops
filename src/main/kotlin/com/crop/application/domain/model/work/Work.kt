package com.crop.application.domain.model.work

class Work(val workId: Long?,
           val planId: Long,
var content: String,
  var imgPath: MutableList<String>,
  ) {
  companion object {
    fun createWork(planId: Long, content: String, imgPath: MutableList<String>): Work {
      return Work(null, planId, content, imgPath)
    }
  }

  fun updateWork() {
    TODO()
  }
}