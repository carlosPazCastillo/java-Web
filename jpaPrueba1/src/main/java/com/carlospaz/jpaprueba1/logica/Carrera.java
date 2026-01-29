
package com.carlospaz.jpaprueba1.logica;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int id;
private String name;
@OneToMany(mappedBy="carrera")
private LinkedList<Materia> listaMaterias;

    public Carrera() {
    }

    public Carrera(int id, String name, LinkedList<Materia> listaMaterias) {
        this.id = id;
        this.name = name;
        this.listaMaterias = listaMaterias;
    }

    public LinkedList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(LinkedList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
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
