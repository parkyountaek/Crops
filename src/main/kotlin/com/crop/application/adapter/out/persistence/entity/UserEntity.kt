package com.crop.application.adapter.out.persistence.entity

import com.crop.application.adapter.out.persistence.entity.base.BaseEntity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "users")
class UserEntity(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", columnDefinition = "bigint") val userId: Long?,
  @Column(name = "email", columnDefinition = "varchar(100)", nullable = false, unique = true) val email: String,
  @Column(name = "password", columnDefinition = "varchar(200)", nullable = false) val password: String,
  @Column(name = "name", columnDefinition = "varchar(50)", nullable = false) val name: String,
  @Column(name = "phone_number", columnDefinition = "varchar(250)") val phoneNumber: String, createdAt: LocalDateTime,
) : BaseEntity()