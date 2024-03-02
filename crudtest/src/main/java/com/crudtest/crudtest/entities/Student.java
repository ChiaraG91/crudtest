package com.crudtest.crudtest.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Boolean isWorking;

    public Student(Long id, String name, String surname, Boolean isWorking) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isWorking = isWorking;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }
}
