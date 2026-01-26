

package com.carlospaz.jpaprueba1;

import com.carlospaz.jpaprueba1.logica.Alumno;
import com.carlospaz.jpaprueba1.logica.Controladora;
import com.carlospaz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba1 {

    public static void main(String[] args) {
        
        Controladora control = new Controladora(); 
        Alumno oso = new Alumno(33,"oso","paz", new Date());
        //Alumno alumno = new Alumno(2,"ivan","paz", new Date());
        
        //control.crearAlumno(alumno);
        control.crearAlumno(oso);
        //control.eliminarAlumno(1);
        
        //alumno.setNombre("Osvaldo");
        
        //control.editarAlumno(alumno);
        
        Alumno carlos = control.traerAlumno(1);
        System.out.println(carlos.toString());
        
        
        ArrayList<Alumno> lista = control.traerListaAlumnos();
        for(Alumno al : lista){
            System.out.println("Alumno" + al.toString());
        }
        
        
        
    }
}
