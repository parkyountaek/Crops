package com.crops.managment.domain.model.entity.embeded;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class DateTimeBaseEntity extends CreateDateTimeBaseEntity {
    @CreatedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedDateTime;

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }
}
