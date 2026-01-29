

package com.carlospaz.jpaprueba1;

import com.carlospaz.jpaprueba1.logica.Alumno;
import com.carlospaz.jpaprueba1.logica.Carrera;
import com.carlospaz.jpaprueba1.logica.Controladora;
import com.carlospaz.jpaprueba1.logica.Materia;
import com.carlospaz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class JpaPrueba1 {

    public static void main(String[] args) {
        
        Controladora control = new Controladora(); 
        //Alumno oso = new Alumno(33,"oso","paz", new Date());
        //Alumno alumno = new Alumno(2,"ivan","paz", new Date());
        
        //control.crearAlumno(alumno);
       // control.crearAlumno(oso);
        //control.eliminarAlumno(1);
        
        //alumno.setNombre("Osvaldo");
        
        //control.editarAlumno(alumno);
        
        //Alumno carlos = control.traerAlumno(1);
        //System.out.println(carlos.toString());
        
        
        //ArrayList<Alumno> lista = control.traerListaAlumnos();
        //for(Alumno al : lista){
          //  System.out.println("Alumno" + al.toString());
        //}
        
        //Creacion de alumno ya asociado con una carrera 
        
        /*Carrera carre = new Carrera(1, "PUI");
        
        control.crearCarrera(carre);
        
        Alumno sol = new Alumno(50, "Solange", "Paz", new Date(), carre);
        
        control.crearAlumno(sol);
        
        Alumno alu = control.traerAlumno(50);
        
        System.out.println("Nombre y Apellido " + alu.getNombre() + alu.getApellido());
        System.out.println("Carrera" + alu.getCarrera().getName());

        */
        
        //Relacion 1 a N 
        
        LinkedList<Materia> mates = new LinkedList<>(); 
        
        //creamos Carrera
        Carrera miCarr = new Carrera(1,"PUI",mates);
        //Add a BD
        control.crearCarrera(miCarr);
        
        
        
        //Creamos Materias
        Materia mate1 = new Materia(1, "Algebra", "Anual", miCarr);
        Materia mate2 = new Materia(2, "ISI", "Cuatrimestral", miCarr);
        Materia mate3 = new Materia(3, "ODC", "Cuatrimestral", miCarr);
        //Add a BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Creamos y agregamos materias a la Lista del principio
        mates.add(mate1);
        mates.add(mate2);
        mates.add(mate3);
        
        miCarr.setListaMaterias(mates);
        control.editarCarrera(miCarr);
        
        //creamos alumno
        Alumno alu = new Alumno(1, "Carlos", "Paz", new Date(), miCarr);
        //Add a BD
        control.crearAlumno(alu);
        
        
        Alumno a = control.traerAlumno(1);
        System.out.println("Nombre y Apellido " + a.getNombre() + a.getApellido());
        System.out.println("Carrera" + a.getCarrera().getName());
        System.out.println("Materias"+ a.getCarrera().getListaMaterias());
        
    }
}
