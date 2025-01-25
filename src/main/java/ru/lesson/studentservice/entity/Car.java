package ru.lesson.studentservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cars")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String model;
    private String stateNumber;
    private String brand;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Car( String model, String stateNumber, String brand) {

        this.model = model;
        this.stateNumber = stateNumber;
        this.brand = brand;
    }

    public Car() {}



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", stateNumber='" + stateNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
