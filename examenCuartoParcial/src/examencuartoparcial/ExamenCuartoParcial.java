package examencuartoparcial;

import javax.swing.JOptionPane;
import java.io.*;

public class ExamenCuartoParcial {

    public static void main(String[] args) {
        //Variables para el main
        int num, ban = 0, cliente = 1, ban2 = 0;
        double cantidad, invActual, invNuevo, invMin, precio;
        String aux, buscar, nameProd, ticketFinal = "Ticket general\n", nameBin;
        Productos ob1 = new Productos();
        RandomAccessFile file = null;
        try {

            do {

                ban = 0;
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema de ventas, usted es el cliente #" + cliente);
                aux = "Recibo del cliente #" + cliente;
                do {
                    nameBin = "productos.dat";
                    file = new RandomAccessFile(nameBin, "rw");
                    buscar = JOptionPane.showInputDialog("Digite la clave del producto");
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de producto"));
                    try {
                        file.seek(0);
                        long LS, Li = 0, pm = 0;
                        LS = (file.length() / 84) - 1;
                        do {
                            pm = (Li + LS) / 2;
                            leer(ob1, file, (pm * 84));
                            if (ob1.clave.compareTo(buscar) < 0) {
                                Li = pm + 1;
                            } else {
                                LS = pm - 1;
                            }
                        } while ((Li <= LS) && !buscar.equals(ob1.clave));
                        if (buscar.equals(ob1.clave)) {
                            JOptionPane.showMessageDialog(null, " Se encontro la clave " + buscar);
                            //A partir de aqui se ejecuta lo demás
                            //Leyendo inventario actual
                            file.seek(((pm * 84) + 68));
                            invActual = file.readDouble();
                            //Calculando el nuevo inventario
                            invNuevo = invActual - cantidad;
                            //Leyendo inventario minimo
                            file.seek(((pm * 84) + 76));
                            invMin = file.readDouble();
                            //Leyendo nombre del producto
                            file.seek(((pm * 84) + 6));
                            nameProd = file.readUTF();
                            //Leyendo precio del producto
                            file.seek(((pm * 84) + 60));
                            precio = file.readDouble();

                            //Modificando el inventario
                            file.close();
                            nameBin = "productos.dat";
                            file = new RandomAccessFile(nameBin, "rw");
                            file.seek(((pm * 84) + 68));
                            file.writeDouble(invNuevo);

                            if (invNuevo <= invMin) {
                                JOptionPane.showMessageDialog(null, "Se necesita surtir el inventario de este producto");
                            }

                            aux = aux + "\nCódigo del producto: " + buscar + "\tNombre: " + nameProd + "\tCantidad: " + cantidad + "\tTotal: $" + (cantidad * precio);

                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro la clave " + buscar);
                            pm = -1;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, " Error al bucar el elemento." + e.toString());
                    }

                    file.close();
                    ban2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si desea agregar mas productos, de lo contrario digite cualquier otro numero"));

                } while (ban2 == 1); //Termina ciclo productos

                //Preguntando si quiere otro cliente
                ban = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para registrar otro cliente, de lo contrario digite cualquier otro numero"));
                if (ban == 1) {
                    cliente++;
                }
                JOptionPane.showMessageDialog(null, aux);
                ticketFinal = ticketFinal + aux + "\n";
            } while (ban == 1);//Termina ciclo clientes
            
            JOptionPane.showMessageDialog(null, ticketFinal);
            
            
            //Generando el reporte en txt
            nameBin = "productos.dat";
            file = new RandomAccessFile(nameBin, "rw");
            reporte(file);
            file.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido el error: " + ex.toString());
        }
    }//Termina Main

    //EMPIEZAN METODOS PARA USAR EN MAIN ARCHIVOS BINARIOS
    static void leer(Productos ob, RandomAccessFile f, long posicion) {
        try {
            f.seek(posicion);
            ob.clave = f.readUTF();
            ob.producto = f.readUTF();
            ob.medida = f.readUTF();
            ob.precio = f.readDouble();
            ob.existencias = f.readDouble();
            ob.existenciasMin = f.readDouble();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }

    }

    static void escribir(Productos x, RandomAccessFile fi, long posicion) {
        String ban;
        try {
            fi.seek(posicion);

            fi.writeUTF(String.format("%-4s", x.clave));
            fi.writeUTF(String.format("%-40s", x.producto));
            fi.writeUTF(String.format("%-10s", x.medida));
            fi.writeDouble(x.precio);
            fi.writeDouble(x.existencias);
            fi.writeDouble(x.existenciasMin);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }
    }

    static void ordenar(Productos ob1, Productos ob2, RandomAccessFile x) {
        try {
            int tr = 84;
            boolean ban = true;
            long n = x.length() / 84;
            for (int pas = 1; ban; pas++) {
                ban = false;
                x.seek(0);
                for (int com = 1; com <= (n - pas); com++) {
                    leer(ob1, x, ((com - 1) * tr));
                    leer(ob2, x, (com * tr));
                    if (ob1.clave.compareTo(ob2.clave) > 0) {
                        ban = true;
                        escribir(ob2, x, ((com - 1) * tr));
                        escribir(ob1, x, (com * tr));
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, es el siguiente: " + ex.toString());
        }

    }

    static void reporte(RandomAccessFile ar) {
        PrintWriter salida = null;
        String aux = "", name = "", encabezado = "";
        try {
            name = "productos.txt";
            salida = new PrintWriter(new FileWriter(name), true);
            encabezado = "REPORTE DE INVENTARIOS\n" + (String.format("%-4s|%-40s|%-10s|%s|%s|%s", "ID", "Nombre del producto", "Medida", "Precio", "Existencias", "Existencias Mínimas"));
            salida.println(encabezado);
            for (int i = 0; i <= ar.length() - 84; i++) {
                ar.seek(i * 84);
                aux = (String.format("%-4s|%-40s|%-10s|%-8.2f|%-8.2f|%-8.2f", ar.readUTF(), ar.readUTF(), ar.readUTF(), ar.readDouble(), ar.readDouble(), ar.readDouble()));
                salida.println(aux);
            }
            salida.close();
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
