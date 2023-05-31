package practicaarchivosutf8;

import java.io.*; // Importar clases para manejo de archivos
import java.util.Scanner;

public class PracticaArchivosUTF8 {

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
        // Ahora se va a abrir el fichero para leerlo

        BufferedReader entrada = null;
        boolean f = false;
        try {
            do {
                try {
                    f = false;
                    System.out.println("Teclea nombre del archivo");
                    fichero = t.nextLine();
                    entrada = new BufferedReader(new FileReader(fichero));
                    int i = 0;
                    aux = entrada.readLine();
                    while (aux != null) {
                        i++;
                        System.out.println("Y dice " + aux);
                        aux = entrada.readLine();
                    }
                    System.out.println("Trabajo concluido");
                } catch (FileNotFoundException e) {
                    System.out.println("Fichero " + " no encontrado");
                    System.out.println("Valor de f " + f);
                    f = true;
                } finally {
                    if (!f) {
                        entrada.close();
                    }
                    System.out.println("Hace el finally " + f);
                    //f=true;
                }
                System.out.println("Valor de f " + f);
            } while (f);
        } catch (IOException e) {
            System.out.println("No se abrio bien ekl archivo " + e.toString());
        }
        // TODO code application logic here
    }
}
