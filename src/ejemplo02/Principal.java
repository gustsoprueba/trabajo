/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

/**
 *
 * @author gustso
 */
public class Principal {
    public static void main(String[] arg){
        System.out.println(Profesor.indicarNombreProfesor()+"("+Profesor.indicarAñosProfesor()+")");
        Profesor.saludarAlPublico();
        System.out.println(Alumno.indicarNombreAlumno());
        Alumno.responderAlProfesor();
    }
    
}
