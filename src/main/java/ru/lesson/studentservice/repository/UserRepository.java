package ru.lesson.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.studentservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
