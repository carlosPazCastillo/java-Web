
package com.carlospaz.persistencia;

import com.carlospaz.jpaprueba1.logica.Alumno;
import com.carlospaz.jpaprueba1.logica.Carrera;
import com.carlospaz.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AlumnoJpaController alu = new AlumnoJpaController();
    CarreraJpaController carr = new CarreraJpaController();

    public void crearAlumno(Alumno a) {
         alu.create(a);
    }

    public void eliminarAlumno(int id) {
        try {
            alu.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno a) {
        try {
            alu.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alu.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List<Alumno> lista = alu.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(lista); 
        return listaAlumnos;
    }

    //Carrera
    public void crearCarrera(Carrera a) {
        carr.create(a);
    }

    public void eliminarCarrera(int id) {
        try {
            carr.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera a) {
        try {
            carr.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carr.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
       List<Carrera> listaC = carr.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>(listaC); 
        return listaCarreras;
    }

    

    

    
}
