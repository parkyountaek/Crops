package com.crop.application.crop.domain.model.entity.embeded

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(
    AuditingEntityListener::class)
class UpdateBaseEntity(
    @LastModifiedDate
    @Column(name = "update_at", nullable = false)
    var updateAt: LocalDateTime? = null
) : CreateBaseEntity()