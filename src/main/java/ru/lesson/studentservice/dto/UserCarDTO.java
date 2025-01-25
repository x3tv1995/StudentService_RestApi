package ru.lesson.studentservice.dto;

import lombok.Data;
import ru.lesson.studentservice.entity.Car;
import ru.lesson.studentservice.entity.User;
@Data
public class UserCarDTO {
    private User user;
    private Car car;
}
