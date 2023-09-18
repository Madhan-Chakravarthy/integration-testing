package com.example.integration.testing.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String country;
}
