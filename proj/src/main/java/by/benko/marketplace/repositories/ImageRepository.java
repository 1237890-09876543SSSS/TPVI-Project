package by.benko.marketplace.repositories;


import by.benko.marketplace.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}