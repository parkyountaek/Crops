package crop.application.domain.model.user

class User(
  val userId: Long?,
  val email: String,
  val password: String,
  val name: String,
  val phoneNumber: String,
  val country: String,
  val role: Role
) {
  companion object {
    fun createUser(
      email: String,
      password: String,
      name: String,
      phoneNumber: String,
      country: String,
      role: Role
    ): User {
      return User(null, email, password, name, phoneNumber, country, role)
    }
  }
}