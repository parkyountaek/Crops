package com.crop.application.adapter.out.persistence.repository

import com.crop.application.adapter.out.persistence.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>