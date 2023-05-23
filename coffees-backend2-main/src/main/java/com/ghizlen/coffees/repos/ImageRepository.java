package com.ghizlen.coffees.repos;

import com.ghizlen.coffees.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
