package com.softtech.week2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,length = 30)
    private String districtName;

    @ManyToOne
    private City city;

}
