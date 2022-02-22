package com.softtech.week2.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nameSurname;
    @ManyToOne
    private Country country ;
    @ManyToOne
    private City city;
    @ManyToOne
    private District district;
    @ManyToOne
    private Neighborhood neighborhood;
    @ManyToOne
    private Street street;
    @Column(nullable = false)
    private int doorNumber;
    @Column(nullable = false)
    private int apartmentNumber;
}