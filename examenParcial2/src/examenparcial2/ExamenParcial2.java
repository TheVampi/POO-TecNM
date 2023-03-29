package examenparcial2;

import javax.swing.JOptionPane;

public class ExamenParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrices ob1 = new Matrices();
        //Primera matriz
        int[][] matriz1;
        matriz1 = ob1.crearMatrizCuadrada();
        ob1.llenarMatrizEspecial(matriz1);
        JOptionPane.showMessageDialog(null, ob1.mostrarMatriz(matriz1));

        //Segunda matriz
        int[][] matriz2;
        matriz2 = ob1.crearMatrizCuadrada();
        ob1.llenarMatrizEspecial(matriz2);
        JOptionPane.showMessageDialog(null, ob1.mostrarMatriz(matriz2));

        //Tercera matriz
        int[][] matriz3;
        matriz3 = ob1.crearMatrizCuadrada();
        ob1.llenarMatrizEspecial(matriz3);
        JOptionPane.showMessageDialog(null, ob1.mostrarMatriz(matriz3));
    }

}

class Matrices {

    int[][] arr;

    //Metodo para crear Matriz Cuadrada con condicion
    int[][] crearMatrizCuadrada() {
        boolean var;
        do {
            var = false;
            int n;
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la dimensión del arreglo cuadrado:"));
            //Evaluando la condicion
            if (n >= 3 && (n % 2 != 0)) {
                arr = new int[n][n];
            } else {
                JOptionPane.showMessageDialog(null, "INCORRECTO, la dimension debe ser un numero impar y mayor o igual a 3");
                var = true;
            }
        } while (var);
        return (arr);
    }

    //Metodo para mostrar datos
    String mostrarMatriz(int[][] matrizParaMostrar) {
        String auxiliar = "CONTENIDO DE LA MATRIZ\n\n";
        for (int fila = 0; fila < matrizParaMostrar.length; fila++) {
            for (int columna = 0; columna < matrizParaMostrar[0].length; columna++) {
                auxiliar = auxiliar + matrizParaMostrar[fila][columna] + "  ";
            }
            auxiliar = auxiliar + "\n";
        }
        return (auxiliar);
    }

    void llenarMatrizEspecial(int[][] mat) {
        //Llenando con 321 la triangular superior
        int n = 2;
        for (int c = mat.length - 1; c >= 0; c--) {
            for (int r = mat[c].length - n; r >= 0; r--) {
                mat[r][c] = 321;
            }
            n = n + 1;
        }

        //Llenando triangular inferior
        int suma = 1;
        n = (mat.length - mat.length) + 1;
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < n; c++) {
                mat[r][c] = suma;
                suma = suma + 1;
            }
            n = n + 1;
        }

    }
}
