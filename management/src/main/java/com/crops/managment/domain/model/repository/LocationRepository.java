package com.crops.managment.domain.model.repository;

import com.crops.managment.domain.model.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {
}
