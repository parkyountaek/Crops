package crop.application.domain.model.crop

class Crop(
  val cropId: Long?,
  val name: String,
  val userId: Long
) {
  companion object {
    fun createCrop(command: CreateCropCommand): Crop {
      return Crop(null, command.name, command.userId)
    }
  }
}