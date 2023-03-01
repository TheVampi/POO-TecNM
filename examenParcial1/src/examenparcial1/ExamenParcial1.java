/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenparcial1;

import javax.swing.*;

/**
 *
 * @author luisi
 */
public class ExamenParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Potencia ejer1 = new Potencia();
        ejer1.pedirDatos();
        ejer1.calcular();
        JOptionPane.showMessageDialog(null, "Resultado final: "+ejer1.calcular());
    }

}

class Potencia {

    double J, K, m, n;
    double X;
    double resultadoNum, resultadoDeno;
    void pedirDatos() {
        J = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numerador"));
        System.out.println(J);
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la potencia m"));
        System.out.println(m);
        K = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del denominador"));
        System.out.println(K);
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la potencia n"));
        System.out.println(n);
    }

    double calcular() {
        //Calculando numerador
        
        if (m > 0) {
            resultadoNum = 1;
            for (int i = 1; i <= m; i++) {
                resultadoNum *= J;
            }
            System.out.println(resultadoNum);
        } else {
            m = m * (-1);
            int res = 1;
            for (int i = 1; i <= m; i++) {
                res *= J;
            }
            resultadoNum = 1 / (res);
        }
        System.out.print(resultadoNum);
        
        //Calculando denominador
        double potDeno = m - n;
        
        if (potDeno > 0) {
            resultadoDeno = 1;
            for (int i = 1; i <= potDeno; i++) {
                resultadoDeno *= K;
            }
        } else {
            potDeno = potDeno * (-1);
                
            int res = 1;
            for (int i = 1; i <= potDeno; i++) {
                res *= K;
            }
            resultadoDeno = 1 / (res);
        }
        
        //Calculando division final
        X= resultadoNum/resultadoDeno;
        return (X);
    }

}
