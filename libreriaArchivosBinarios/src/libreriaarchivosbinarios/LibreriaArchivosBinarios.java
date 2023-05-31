package libreriaarchivosbinarios;

import javax.swing.JOptionPane;
import java.io.*;

public class LibreriaArchivosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Declarando la longitud del registro
        clave (String) 4+2=6
        producto (String) 40+2=42
        medida (String) 10+2=12
        precio (double) 8
        existencias (double) 8
        existencia mínima (double) 8
        Total de bytes: 84 (Esta será la longitud para UN REGISTRO en el archivo)
         */
        Productos ob1 = new Productos();
        Productos ob2 = new Productos();

        int longitudRegistro = 84;
        String ban, fichero;
        Boolean indi = true;
        RandomAccessFile nya, aux, nyaLeer; //nya será el canal de comunicacion entre el programa y el fichero
        try {
            fichero = JOptionPane.showInputDialog("Teclea el nombre del fichero");
            nya = new RandomAccessFile(fichero, "rw");

            do {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones\n1.Crear archivo y escribir datos en el archivo\n2.Ordenar archivo"));
                switch (num) {
                    case 1: {

                        JOptionPane.showMessageDialog(null, "El tamaño del registro por producto va a ser de: " + longitudRegistro);
                        nya = new RandomAccessFile(fichero, "rw");
                        escribirInicial(ob1, nya);

                        indi = true;
                    }
                    break;
                    case 2: {
                        ordenar(ob1, ob2, nya);
                        indi = true;
                    }
                    break;
                    case 4: {

                        reporte(nya);
                        indi = true;
                    }break;
                    case 5: {
                        nya.close();
                        System.exit(0);
                    }

                }
            } while (indi);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex);
        }

    }

    static void escribirInicial(Productos x, RandomAccessFile file) {
        String ban;
        try {
            file.seek(0);
            do {
                x.Capturar();
                file.writeUTF(String.format("%-4s", x.clave));
                file.writeUTF(String.format("%-40s", x.producto));
                file.writeUTF(String.format("%-10s", x.medida));
                file.writeDouble(x.precio);
                file.writeDouble(x.existencias);
                file.writeDouble(x.existenciasMin);

                ban = JOptionPane.showInputDialog("Deseas registrar otro producto, escribe \"SI\" para terminar escribe cualquier otra palabra");

            } while (ban.toUpperCase().equals("SI"));

            JOptionPane.showMessageDialog(null, "La escritura se ha completado");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }
    }

    static void leer(Productos ob, RandomAccessFile file, long posicion) {
        try {
            file.seek(posicion);
            ob.clave = file.readUTF();
            ob.producto = file.readUTF();
            ob.medida = file.readUTF();
            ob.precio = file.readDouble();
            ob.existencias = file.readDouble();
            ob.existenciasMin = file.readDouble();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }

    }

    static void escribir(Productos x, RandomAccessFile file, long posicion) {
        String ban;
        try {
            file.seek(posicion);

            file.writeUTF(String.format("%-4s", x.clave));
            file.writeUTF(String.format("%-40s", x.producto));
            file.writeUTF(String.format("%-10s", x.medida));
            file.writeDouble(x.precio);
            file.writeDouble(x.existencias);
            file.writeDouble(x.existenciasMin);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }
    }

    static void ordenar(Productos ob1, Productos ob2, RandomAccessFile file) {
        try {
            int tr = 84;
            boolean ban = true;
            long n = file.length() / 84;
            for (int pas = 1; ban; pas++) {
                ban = false;
                file.seek(0);
                for (int com = 1; com <= (n - pas); com++) {
                    leer(ob1, file, ((com - 1) * tr));
                    leer(ob2, file, (com * tr));
                    if (ob1.clave.compareTo(ob2.clave) > 0) {
                        ban = true;
                        escribir(ob2, file, ((com - 1) * tr));
                        escribir(ob1, file, (com * tr));
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }

    }

    static void reporte(RandomAccessFile file) {
        PrintWriter salida = null;
        String aux="",name="",encabezado="";
        try {
            name = JOptionPane.showInputDialog("Indica el nombre del archivo en extension .txt");
            salida = new PrintWriter(new FileWriter(name),true);
            encabezado = "REPORTE DE INVENTARIOS\n"+(String.format("%-4s|%-40s|%-10s|%-8s|%-8s|%-8s", "ID", "Nombre del producto", "Medida", "Precio", "Existencias", "Existencias Mínimas"));
            salida.println(encabezado);
            for (int i = 0; i <= file.length() - 84; i++) {
                file.seek(i * 84);
                aux = (String.format("%-4s|%-40s|%-10s|%s|%s|%s", file.readUTF(), file.readUTF(), file.readUTF(), file.readDouble(), file.readDouble(), file.readDouble()));
                salida.println(aux);
            }
            
            System.out.println(aux);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }
        
    }

}

class Productos {

    //Declarando los datos para el fichero
    String clave, producto, medida;
    Double precio, existencias, existenciasMin;

    void Capturar() {
        clave = JOptionPane.showInputDialog("Ingresa la clave del producto (4 dígitos)");
        producto = JOptionPane.showInputDialog("Ingresa el nombre del producto (maximo 40 caracteres)");
        medida = JOptionPane.showInputDialog("Ingresa la unidad de medida del producto (maximo 10 caracteres)");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto"));
        existencias = Double.parseDouble(JOptionPane.showInputDialog("Ingresa las existencias del producto"));
        existenciasMin = Double.parseDouble(JOptionPane.showInputDialog("Ingresa las existencias mínimas del producto"));
    }
}
