package examendiagnosticopoo;

import javax.swing.*;

public class ExamenDiagnosticoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, residuo, i, bandera;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cualquier numero entero diferente de 1"));

        if (numero <= 1) {
            JOptionPane.showMessageDialog(null, "Valor no admitido, debe ser mayor que 1");
            System.exit(0);
        } else {

            residuo = 0;
            i = 2;
            while (i <= numero - 1) {
                residuo = numero % i;

                if (residuo == 0) {

                    JOptionPane.showMessageDialog(null, "NO es un numero primo" + residuo);
                    System.exit(0);
                }
                i++;

            }
            JOptionPane.showMessageDialog(null, "SI es un numero primo");

        }
    }

}
