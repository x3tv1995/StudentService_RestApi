package ru.lesson.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.studentservice.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
