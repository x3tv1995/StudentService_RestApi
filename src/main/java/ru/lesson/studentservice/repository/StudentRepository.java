package ru.lesson.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.studentservice.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
