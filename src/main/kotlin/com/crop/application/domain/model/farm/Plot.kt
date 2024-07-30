package com.crop.application.domain.model.farm

class Plot(
  var plotId: Long? = null,
  var name: String,
  var description: String
) {
  companion object {
    fun createPlot(name: String, description: String): Plot {
      return Plot(name = name, description = description)
    }
  }
}