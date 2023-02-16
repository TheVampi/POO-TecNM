package practica1_1;

import javax.swing.*;

public class Practica1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Combinaciones op1 = new Combinaciones();
        op1.objetos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de objetos"));
        op1.muestra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de muestras"));

        /*
        Formula:
                                   objetos!
           Combinacion= -----------------------------
                         muestra!*(objetos-muestra)!
         */
        op1.comb = (op1.calcularFactorial(op1.objetos)) / (op1.calcularFactorial(op1.muestra) * op1.calcularFactorial((op1.objetos - op1.muestra)));
        JOptionPane.showMessageDialog(null, "Combinaciones totales: \nNumero de objetos: " + op1.objetos + "\nNumero de la muestra: " + op1.muestra + "\nC0mbinaciones totales: " + op1.comb);
        System.exit(0);
    }

}

class Combinaciones {

    float objetos, muestra, comb;

    float calcularFactorial(float numero) {
        float factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial = factorial * i;
        }
        return (factorial);
    }
}
