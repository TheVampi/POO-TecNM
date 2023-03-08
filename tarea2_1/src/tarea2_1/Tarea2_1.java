/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2_1;
import javax.swing.JOptionPane;

/**
 *
 * @author luisi
 */
public class Tarea2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando el arreglo de objetos
        Alumno [] arregloAlumnos;
        int numeroDeAlumnos;
        numeroDeAlumnos = Integer.parseInt(JOptionPane.showInputDialog( "Digite el numero de alumnos a registrar"));
        arregloAlumnos = new Alumno [numeroDeAlumnos];
        for (int i=0; i<arregloAlumnos.length; i++){
            
        }
        /*Alumno al1 = new Alumno();
        JOptionPane.showInputDialog("Ingrese el")
        switch ()*/
    }
    
}

class Alumno{
    String nombre, noControl;
    double promedio;
    
    void leerDatos(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        noControl = JOptionPane.showInputDialog("Ingrese el numero de control");
        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del alumno:"));
    }
    
}
