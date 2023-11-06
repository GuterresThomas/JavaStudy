package com.learning.demo.entities;

public class Departament {
    private Long id;
    private String name;


    public Departament(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Departament() {

    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

