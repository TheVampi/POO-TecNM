package tarea2_1;

import javax.swing.JOptionPane;

public class Tarea2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando el arreglo de objetos
        int numeroDeAlumnos, num;
        String aux = "REGISTRO GENERAL DE ALUMNOS\nEstructura de la tabla:\nNombre // No. Control // Promedio\n\n";
        Alumno[] arregloAlumnos;
        numeroDeAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de alumnos a registrar"));
        arregloAlumnos = new Alumno[numeroDeAlumnos];
        for (int i = 0; i < arregloAlumnos.length; i++) {
            arregloAlumnos[i] = new Alumno();
            arregloAlumnos[i].leerDatos();
            aux = aux + arregloAlumnos[i].mostrarDatos() + "\n";
        }
        JOptionPane.showMessageDialog(null, aux);

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de operacion deseado\n#1 Mostrar tabla de alumnos\n#2 Ordenar arreglo por No. de control\n#3 Ordenar arreglo por nombre\n#4 Consulta de datos por No. de control\n#5 Salir del programa"));

            switch (num) {
                case 1: {
                    //Mostrando tabla con todos los alumnos
                    JOptionPane.showMessageDialog(null, aux);
                }
                break;
                
                case 2:{
                    //Ordenando el arreglo por NUMERO DE CONTROL metodo de burbuja

                    //Ordenando el renglon con metodo burbuja
                    Alumno arregloAuxiliar;
                    //Ordenandolos elementos
                    for (int pasadas = 1; pasadas < arregloAlumnos.length; pasadas++) {
                        for (int comparaciones = 1; comparaciones <= arregloAlumnos.length - 1; comparaciones++) {

                            if (arregloAlumnos[comparaciones - 1].noControl.compareTo(arregloAlumnos[comparaciones].noControl) > 0) {
                                arregloAuxiliar = arregloAlumnos[comparaciones - 1];
                                arregloAlumnos[comparaciones - 1] = arregloAlumnos[comparaciones];
                                arregloAlumnos[comparaciones] = arregloAuxiliar;
                            }
                        } //AQUI TERMINA CICLO DE COMPARACIONES      
                    } //AQUI TERMINA CICLO DE PASADAS

                    //Mostrando los arreglos ordenados en una variable nueva
                    aux = "REGISTRO GENERAL DE ALUMNOS ORDENADOS POR NUMERO DE CONTROL\nEstructura de la tabla:\nNombre // No. Control // Promedio\n\n";
                    for (int i = 0; i < arregloAlumnos.length; i++) {
                        aux = aux + arregloAlumnos[i].mostrarDatos() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, aux);
                    
                }break;
                case 3: {
                    //Ordenando el arreglo por NOMBRE metodo de burbuja

                    //Ordenando el renglon con metodo burbuja
                    Alumno arregloAuxiliar;
                    //Ordenandolos elementos
                    for (int pasadas = 1; pasadas < arregloAlumnos.length; pasadas++) {
                        for (int comparaciones = 1; comparaciones <= arregloAlumnos.length - 1; comparaciones++) {

                            if (arregloAlumnos[comparaciones - 1].nombre.compareTo(arregloAlumnos[comparaciones].nombre) > 0) {
                                arregloAuxiliar = arregloAlumnos[comparaciones - 1];
                                arregloAlumnos[comparaciones - 1] = arregloAlumnos[comparaciones];
                                arregloAlumnos[comparaciones] = arregloAuxiliar;
                            }
                        } //AQUI TERMINA CICLO DE COMPARACIONES      
                    } //AQUI TERMINA CICLO DE PASADAS

                    //Mostrando los arreglos ordenados en una variable nueva
                    aux = "REGISTRO GENERAL DE ALUMNOS ORDENADOS POR NOMBRE\nEstructura de la tabla:\nNombre // No. Control // Promedio\n\n";
                    for (int i = 0; i < arregloAlumnos.length; i++) {
                        aux = aux + arregloAlumnos[i].mostrarDatos() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, aux);
                }
                break;
                
                case 5: {
                    System.exit(0);
                }
                break;

            }
        } while (true);

    }

}

class Alumno {

    String nombre, noControl;
    double promedio;

    void leerDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
        noControl = JOptionPane.showInputDialog("Ingrese el numero de control");
        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del alumno:"));
    }

    String mostrarDatos() {
        String aux;
        aux = nombre + " // " + noControl + " // " + promedio;
        return (aux);
    }

}
