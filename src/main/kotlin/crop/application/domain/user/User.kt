package crop.application.domain.user

class User(
    val userId: Long,
    val name: String,
    val phoneNumber: String,
    val country: String,
    val Role: Role
) {
}