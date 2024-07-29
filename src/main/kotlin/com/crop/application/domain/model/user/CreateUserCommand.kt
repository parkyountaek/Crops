package com.crop.application.domain.model.user

data class CreateUserCommand(val email: String,
                             val password: String,
                             val name: String,
                             val phoneNumber: String,
                             val country: String,
                             val role: Role
)
