package ru.lesson.studentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "firstName is not null")
    @Size(min = 2,max = 50,message = " Length 2-50")
    private String firstName;

    @NotBlank(message = "lastName is not null")
    @Size(min = 2,max = 50,message = " Length 2-50")
    private String lastName;

    @Past
    private LocalDate birthDate;

    @Email(message = "incorrect email")
    private String email;

    @DecimalMin(value = "0.0")
    @DecimalMax(value = "5.0")
    private double gpa;

    @Min(value = 2000,message = "No under 2000")
    @Max(value = 2025,message = "Max 2025")
    private int yearRegisters;
}
