package ru.lesson.studentservice.dto;

import lombok.Data;
import ru.lesson.studentservice.entity.Car;
import ru.lesson.studentservice.entity.User;

import java.util.List;

@Data
public class UserCarDTO {
    private User user;
    private List<Car> cars;
}
