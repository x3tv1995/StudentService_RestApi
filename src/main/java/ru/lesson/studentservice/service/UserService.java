package ru.lesson.studentservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.lesson.studentservice.entity.Car;
import ru.lesson.studentservice.entity.Student;
import ru.lesson.studentservice.entity.User;
import ru.lesson.studentservice.repository.CarRepository;
import ru.lesson.studentservice.repository.UserRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private CarRepository carRepository;

    public User save(User user,Car car) {
        User newUser = userRepository.save(user);
     car.setModel(car.getModel());
     car.setBrand(car.getBrand());
     car.setStateNumber(car.getStateNumber());
     car.setUser(user);
        carRepository.save(car);
        newUser.getCars().add(car);
        return userRepository.save(newUser);
    }


}
