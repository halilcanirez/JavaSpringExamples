package com.softtech.finalproject.model;

import com.softtech.finalproject.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
public class TaxRatesEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String productType;
    @Column(nullable = false)
    Double taxRates;
}
