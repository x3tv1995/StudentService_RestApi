package ru.lesson.studentservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String priority;
    private LocalDate createAt = LocalDate.now();
    private LocalDate updateAt = LocalDate.now();
    private LocalDate finishAt = LocalDate.now();
    private String description;
    private String status="CREATED";



    @ElementCollection
    @CollectionTable(name = "performers", joinColumns = @JoinColumn(name = "id_task"))
    @Column(name = "name")
    private List<String> performers = new ArrayList<>();




}
