package ru.lesson.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.studentservice.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
