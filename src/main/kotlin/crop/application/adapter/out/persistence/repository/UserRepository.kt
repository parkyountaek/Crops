package crop.application.adapter.out.persistence.repository

import crop.application.domain.model.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}