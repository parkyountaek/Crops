package crop.application.domain.model.crop

class Crop(
  val cropId: Long?,
  val name: String,
  val userId: Long
) {
  companion object {
    fun createCrop(name: String, userId: Long): Crop {
      return Crop(null, name, userId)
    }
  }
}