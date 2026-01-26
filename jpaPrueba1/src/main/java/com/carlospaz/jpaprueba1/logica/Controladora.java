
package com.carlospaz.jpaprueba1.logica;

import com.carlospaz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class Controladora {
    
    
    ControladoraPersistencia ctrl = new ControladoraPersistencia(); 
    
    public void crearAlumno(Alumno a){
        ctrl.crearAlumno(a);
    }
    
    public void eliminarAlumno(int id){
        ctrl.eliminarAlumno(id);
    }
    
    
    public void editarAlumno(Alumno a){
        ctrl.editarAlumno(a);
    }
    
    public Alumno traerAlumno(int id){
        return ctrl.traerAlumno(id);     
    }
    
    public ArrayList<Alumno> traerListaAlumnos (){
        return ctrl.traerListaAlumnos();
    }
}
