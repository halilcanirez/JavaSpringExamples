package com.softtech.week2.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Data
@Entity
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    @ManyToOne
    private Neighborhood neighborhood;

}
