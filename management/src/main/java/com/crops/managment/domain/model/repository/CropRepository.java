package com.crops.managment.domain.model.repository;

import com.crops.managment.domain.model.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop, String> {
}
