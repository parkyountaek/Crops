package com.crop.application.domain.model.user

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
    fun createUser(command: CreateUserCommand): User {
      return User(
        null,
        command.email,
        command.password,
        command.name,
        command.phoneNumber,
        command.country,
        command.role
      )
    }
  }
}