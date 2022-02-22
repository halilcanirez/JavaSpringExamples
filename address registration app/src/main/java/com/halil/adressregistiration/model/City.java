package com.softtech.week2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="city",nullable = false,length=100)
    private String cityName;

    @Column(name = "plate",nullable = false,length = 15, unique = true)
    private int plate;

}

