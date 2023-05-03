package examentercerparcial;

import javax.swing.JOptionPane;

public class ExamenTercerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de trabajadores a registrar: "));

        Trabajador[] arr = new Trabajador[n];
        int contSindi = 0, contConfi = 0;
        String aux = "\nREGISTRO GENERAL DE TRABAJADORES:\n\n";
        for (int i = 0; i < arr.length; i++) {
            boolean ban = false;
            int tipo;
            do {               
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de trabajador a registrar en el espacio: " + (i + 1) + "\nOprima 1 para SINDICALIZADO\nOprima 2 para CONFIANZA"));
                if (tipo == 1 || tipo == 2) {
                    ban = false;
                }else{
                    ban = true;
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, digite de nuevo");
                }
            } while (ban);

            switch (tipo) {
                case 1: {
                    arr[i] = new Sindicalizado();
                    arr[i].capturar();
                    arr[i].calcularImpuesto();
                    JOptionPane.showMessageDialog(null, arr[i].mostrar());
                    aux = aux + arr[i].mostrar() + "\n";
                    contSindi++;
                }
                break;
                case 2: {
                    arr[i] = new Confianza();
                    arr[i].capturar();
                    arr[i].calcularImpuesto();
                    JOptionPane.showMessageDialog(null, arr[i].mostrar());
                    aux = aux + arr[i].mostrar() + "\n";
                    contConfi++;
                }
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Numero de trabajadores SINDICALIZADOS: " + contSindi + "\nNumero de trabajadores de CONFIANZA: " + contConfi + aux);
    }

}

abstract class Trabajador {

    String RFC, nombre;
    double salarioBruto, impuesto, salarioNeto;

    public void capturar() {
        RFC = JOptionPane.showInputDialog("Ingresa el RFC del trabajador");
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del trabajador");
        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario bruto del trabajador"));
    }

    abstract public void calcularImpuesto();

    public String mostrar() {
        return ("\n\nEstos son los datos del trabajador registrado:\nNombre: " + nombre + "\nRFC: " + RFC + "\nSalario Bruto: $" + salarioBruto + "\nImpuestos: $" + impuesto + "\nSalario Neto: $" + salarioNeto + "\n");
    }
}

class Sindicalizado extends Trabajador {

    String seccionAfiliado;

    public void capturar() {
        super.capturar();
        seccionAfiliado = JOptionPane.showInputDialog("Ingresa la seccion afiliada del Sindicalizado:");
    }

    public void calcularImpuesto() {
        impuesto = salarioBruto * 0.09;
        salarioNeto = salarioBruto - impuesto;
    }

    public String mostrar() {
        return (super.mostrar() + "Seccion Afiliada del sindicalizado: " + seccionAfiliado);
    }
}

class Confianza extends Trabajador {

    int horasTrabajadas;

    public void capturar() {
        super.capturar();
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas:"));
    }

    public void calcularImpuesto() {
        impuesto = (salarioBruto * 0.12) + ((salarioBruto * 0.12) * 0.05);

        salarioNeto = salarioBruto - impuesto;
    }

    public String mostrar() {
        return (super.mostrar() + "Horas trabajadas: " + horasTrabajadas);
    }
}
