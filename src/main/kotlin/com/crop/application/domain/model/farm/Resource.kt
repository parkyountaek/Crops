package com.crop.application.domain.model.farm

class Resource(
  val resourceId: Long? = null,
  val farmId: Long,
  var name: String,
  var amount: Double,
  var unit: String
) {
  companion object {
    fun createResource(farmId: Long, name: String, amount: Double, unit: String): Resource {
      return Resource(farmId = farmId, name = name, amount = amount, unit = unit)
    }
  }
}