
package com.carlospaz.jpaprueba1.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carrera {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int id;
private String name;

    public Carrera() {
    }

    public Carrera(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
