package ejemploarchivos;

import java.io.*; // Importar clases para manejo de archivos
import java.util.Scanner;

public class EjemploArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in); // Objeto para leer desde teclado
        String fichero, aux;
        PrintWriter salida = null; // Inicializando referencia
        try {
            System.out.println("Teclea nombre del fichero");
            fichero = t.nextLine();
            salida = new PrintWriter(new FileWriter(fichero)); // Se abre el Fichero
            System.out.println("Teclea 3 lineas:");
            for (int i = 1; i <= 3; i++) {
                aux = t.nextLine();
                salida.println(i + " " + aux);
            }
            salida.close(); // Se cierra el fichero
            System.out.println("Se escribieron las lineas en " + fichero);
        } catch (IOException e) {
            System.out.println(" No se abrio bien el fichero \n" + e.toString());
        }
    }

}
