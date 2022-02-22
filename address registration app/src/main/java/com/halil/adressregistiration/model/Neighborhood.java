package com.softtech.week2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
public class Neighborhood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String neighborhoodName;
    @Column(nullable = false)
    private int postalCode;

    @ManyToOne
    private District district;

}
