
package com.carlospaz.jpaprueba1.logica;

import com.carlospaz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class Controladora {
    
    
    ControladoraPersistencia ctrl = new ControladoraPersistencia(); 
    
    //Clase Alumno
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
    
    //Clase carrera
    public void crearCarrera(Carrera a){
        ctrl.crearCarrera(a);
    }
    
    public void eliminarCarrera(int id){
        ctrl.eliminarCarrera(id);
    }
    
    
    public void editarCarrera(Carrera a){
        ctrl.editarCarrera(a);
    }
    
    public Carrera traerCarrera(int id){
        return ctrl.traerCarrera(id);     
    }
    
    public ArrayList<Carrera> traerListaCarreras(){
        return ctrl.traerListaCarreras();
    }
    
    //Clase Materia
    
    public void crearMateria(Materia a){
        ctrl.crearMateria(a);
    }
    
    public void eliminarMateria(int id){
        ctrl.eliminarMateria(id);
    }
    
    
    public void editarMateria(Materia a){
        ctrl.editarMateria(a);
    }
    
    public Materia traerMateria(int id){
        return ctrl.traerMateria(id);     
    }
    
    public ArrayList<Materia> traerListaMateria (){
        return ctrl.traerListaMateria();
    }
    
    
    
    
    
    
    
    
}
