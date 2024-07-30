package com.crop.application.domain.model.user

class User(
  val userId: Long? = null,
  val email: String,
  val password: String,
  val name: String,
  val phoneNumber: String,
  val country: String,
  val role: Role
) {
  companion object {
    fun createUser(command: CreateUserCommand): User {
      return User(
        email = command.email,
        password = command.password,
        name = command.name,
        phoneNumber = command.phoneNumber,
        country = command.country,
        role = command.role
      )
    }
  }
}