package Modelo;

import Controlador.AlumnoData;
import Controlador.Conexion;
import Controlador.InscripcionData;
import Controlador.MateriaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class TransversalG1 {

    public static void main(String[] args) throws SQLException {

        Conexion con = new Conexion();
        AlumnoData ad = new AlumnoData(con);

     
        Alumno a1 = new Alumno(1515,"Fulana", "Gala", LocalDate.of(1987, 12, 25), true);
        Alumno a2 = new Alumno(1616,"Villegas", "Rocio", LocalDate.of(1975, 6, 10), false);
        Alumno a3 = new Alumno(1717,"Gonzalez", "Ramon", LocalDate.of(1967, 8, 1), true);
        Alumno a4 = new Alumno(1818,"Romualdo", "Funesio", LocalDate.of(1967, 8, 1), true);

        ad.guardarAlumno(a1);
        ad.guardarAlumno(a2);
        ad.guardarAlumno(a3);
        ad.guardarAlumno(a4);

        ad.modificarAlumno(6, a1);
        ad.activarAlumno(6);
        ad.eliminarAlumno(6);
        System.out.println(ad.listarAlumnos());
        System.out.println(" " + ad.buscarAlumno(4));
        System.out.println(" " + ad.listarAlumnos());

        MateriaData md = new MateriaData(con);

        Materia m1 = new Materia("Matematica", 4, true);
        Materia m2 = new Materia("Lengua", 3, false);

        md.guardarMateria(m1);
        md.guardarMateria(m2);
        md.modificarMateria(5, m2);
        md.eliminarMateria(5);
        md.activarMateria(5);
        System.out.println(" " + m1);
        System.out.println(" " + md.listarMaterias());
        System.out.println(md.buscarMateria(5));
       
        Inscripcion insc = new Inscripcion();
        InscripcionData id = new InscripcionData(con);
        
        List <Alumno> lista = id.obtenerAlumnosXMateria(1);
        
        for(Alumno a : lista){
            
            System.out.println(a.getApellido());
            System.out.println(a.getFechaNac());
        }
   
        


    ad.listarAlumnos().forEach(alumno->{System.out.println(alumno);});
   
    }

}
