
package practica2_2;

import javax.swing.JOptionPane;

/**
 *
 * @author luisi
 */
public class Practica2_2 {

    public static void main(String[] args) {
        //AQUI VAMOS A PROBAR CADA FUNCION UWU
        Matrices objeto1 = new Matrices();
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de matrices, vamos a crear la primer matriz");
        
        
        //Creando y leyendo la primera matriz
        int[][] matriz1;
        matriz1 = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matriz1));
        
        //Creando y leyendo la segunda matriz
        JOptionPane.showMessageDialog(null, "Ahora vamos a crear la segunda matriz");
        int[][] matriz2;
        matriz2 = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matriz2));
        
        //Calculando la suma de la primera y la segunda
        int[][] matriz3 = new int[matriz1.length][matriz1[0].length];
        objeto1.sumarMatriz(matriz1, matriz2, matriz3);
        JOptionPane.showMessageDialog(null, "SUMA DE LAS MATRICES\n"+objeto1.mostrarMatriz(matriz3));
        
        //Calculando la RESTA de la PRIMERA menos la SEGUNDA
        int[][] matriz4 = new int[matriz1.length][matriz1[0].length];
        objeto1.restarMatriz(matriz1, matriz2, matriz4);
        JOptionPane.showMessageDialog(null, "RESTA DE LAS MATRICES\n"+objeto1.mostrarMatriz(matriz4));
        
        //Calculando la suma de cada renglon y mostrandola al final de cada columna de cada renglon
        int[][] matriz9;
        matriz9 = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.sumarYMostrarRenglones(matriz9));
        
        //Ordenando un arreglo de 2 dimensiones de MENOR A MAYOR UTILIZANDO METODO DE LA BURBUJA
        int[][] arregloParaOrdenar;
        arregloParaOrdenar = objeto1.leerMatrizYLlenarRandom();
        //Mostrando el arreglo desordenado
        JOptionPane.showMessageDialog(null, "Arreglo desordenado: "+objeto1.mostrarMatriz(arregloParaOrdenar));
        //Mostrando y ordenando el arreglo inicial
        objeto1.arregloDosDimensionesOrdenado(arregloParaOrdenar);
        JOptionPane.showMessageDialog(null, "Arreglo ordenado de menor a mayor: \n" + objeto1.mostrarMatriz(arregloParaOrdenar));
        
        //Obteniendo una matriz transpuesta de dimensiones n*n
        int[][] arregloParaTransponer;
        arregloParaTransponer = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arregloParaTransponer));
        arregloParaTransponer = objeto1.obtenerMatrizTranspuesta(arregloParaTransponer);
        JOptionPane.showMessageDialog(null, "RESULTADO MATRIZ TRANSPUESTA:\n" + objeto1.mostrarMatriz(arregloParaTransponer));
        
        //Sumando las diagonales normal e invertida una matriz cuadrada
        int[][] matrizDiagonal;
        matrizDiagonal = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matrizDiagonal));
        objeto1.obtenerSumaDiagonalMatrizCuadrada(matrizDiagonal);
    }
    
}

class Matrices{
    
    //Metodo para llenar matrices con valores random de tipo entero con rango n a n
    int[][] leerMatrizYLlenarRandom() {
        int filas, columnas;
        //Pidiendo las dimensiones del arreglo
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        //Creando el arreglo
        int[][] unArreglo = new int[filas][columnas];

        //Llenando con datos
        for (int filaParaLlenar = 0; filaParaLlenar < unArreglo.length; filaParaLlenar++) {
            for (int columnaParaLlenar = 0; columnaParaLlenar < unArreglo[0].length; columnaParaLlenar++) {
                unArreglo[filaParaLlenar][columnaParaLlenar] = (int) (Math.random() * (50+1) + (-20)); //Math.random() * (valor maximo + 1) + (valor minimo)
            }
        }
        return (unArreglo);
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
    
    //Metodo para sumar arreglos
    void sumarMatriz(int[][] matrizAEvaluar1, int[][] matrizAEvaluar2, int[][] matrizresultante) {

        //Evalua si son del mismo orden las matrices creadas DE LO CONTRARIO NO SE HACE LA SUMA
        if ((matrizAEvaluar1.length == matrizAEvaluar2.length) && (matrizAEvaluar1[0].length == matrizAEvaluar2[0].length)) {
            for (int fila = 0; fila < matrizAEvaluar1.length; fila++) {
                for (int columna = 0; columna < matrizAEvaluar1[0].length; columna++) {
                    matrizresultante[fila][columna] = matrizAEvaluar1[fila][columna] + matrizAEvaluar2[fila][columna];
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Las matrices no son del mismo orden, no se pueden hacer operaciones");
        }

    }
    
    //Metodo para restar arreglos
    void restarMatriz(int[][] matrizAEvaluar1, int[][] matrizAEvaluar2, int[][] matrizresultante) {

        //Evalua si son del mismo orden las matrices creadas DE LO CONTRARIO NO SE HACE LA RESTA
        if ((matrizAEvaluar1.length == matrizAEvaluar2.length) && (matrizAEvaluar1[0].length == matrizAEvaluar2[0].length)) {
            for (int fila = 0; fila < matrizAEvaluar1.length; fila++) {
                for (int columna = 0; columna < matrizAEvaluar1[0].length; columna++) {
                    matrizresultante[fila][columna] = matrizAEvaluar1[fila][columna] - matrizAEvaluar2[fila][columna];
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Las matrices no son del mismo orden, no se pueden hacer operaciones");
        }

    }
    
    //Metodo para sumar renglones y poner su valor en la ultima columna
    String sumarYMostrarRenglones(int[][] matrizAEvaluar) {
        String aux = "Contenido de la matriz y sumatoria en la ultima columna:\n";
        int suma = 0;
        for (int renglon = 0; renglon < matrizAEvaluar.length; renglon++) {
            for (int columna = 0; columna < matrizAEvaluar[renglon].length; columna++) {
                suma = suma + matrizAEvaluar[renglon][columna];
                aux = aux + " " + matrizAEvaluar[renglon][columna];
            }           
            aux = aux + "  Suma: " + suma + "\n";
            suma = 0;
        }

        return (aux);
    }
    
    //Ordenando un arreglo de 2 dimensiones de MENOR A MAYOR UTILIZANDO METODO DE LA BURBUJA
    void arregloDosDimensionesOrdenado(int[][] arregloParaOrdenar) {
        //Para ordenar un arreglo de dos dimensiones primero pasamos todos sus datos a un arreglo de una dimension para poder asi ordenarlos con el metodo de la burbuja

        //Declarando un array de longitud n*n de acuerdo al original
        int[] arregloBurbuja = new int[arregloParaOrdenar.length * arregloParaOrdenar[0].length];

        //Asignando los valores en desorden al arreglo de una dimension
        int posicion = 0;
        for (int fila = 0; fila < arregloParaOrdenar.length; fila++) {
            for (int columna = 0; columna < arregloParaOrdenar[0].length; columna++) {
                arregloBurbuja[posicion] = arregloParaOrdenar[fila][columna];
                posicion++;
            }
        }

        //ORDENANDO CON METODO BURBUJA
        int variableAuxiliar;

        //Ordenandolos elementos
        for (int pasadas = 1; pasadas < arregloBurbuja.length; pasadas++) {
            for (int comparaciones = 1; comparaciones <= arregloBurbuja.length - 1; comparaciones++) {

                if (arregloBurbuja[comparaciones - 1] > arregloBurbuja[comparaciones]) {
                    variableAuxiliar = arregloBurbuja[comparaciones - 1];
                    arregloBurbuja[comparaciones - 1] = arregloBurbuja[comparaciones];
                    arregloBurbuja[comparaciones] = variableAuxiliar;
                }
            } //AQUI TERMINA CICLO DE COMPARACIONES      
        } //AQUI TERMINA CICLO DE PASADAS

        //Una vez asignados, los volvemos a acomodar en el arreglo original (PERO YA ORDENADOS)
        posicion = 0;
        for (int fila = 0; fila < arregloParaOrdenar.length; fila++) {
            for (int columna = 0; columna < arregloParaOrdenar[0].length; columna++) {
                arregloParaOrdenar[fila][columna] = arregloBurbuja[posicion];
                posicion++;
            }
        }

    }
    
    //Metodo para obtener una matriz transpuesta (Los renglones pasan a columnas y las columnas a renglones)
    int[][] obtenerMatrizTranspuesta(int[][] matrizAConvertir) {

        //Creando la nueva matriz con dimensiones invertidas de la original
        int[][] matrizTranspuesta = new int[matrizAConvertir[0].length][matrizAConvertir.length];

        //Asignando los nuevos valores a la nueva matriz
        for (int filaDeLaTranspuesta = 0; filaDeLaTranspuesta < matrizAConvertir[0].length; filaDeLaTranspuesta++) {
            for (int columnaDeLaTranspuesta = 0; columnaDeLaTranspuesta < matrizAConvertir.length; columnaDeLaTranspuesta++) {
                matrizTranspuesta[filaDeLaTranspuesta][columnaDeLaTranspuesta] = matrizAConvertir[columnaDeLaTranspuesta][filaDeLaTranspuesta];
            }
        }
        return (matrizTranspuesta);
    }
    
    //Metodo para sumar en diagonal normal y diagonal invertida una MATRIZ CUADRADA
    void obtenerSumaDiagonalMatrizCuadrada(int[][] matrizParaSacarDiagonal) {
        int sumatoriaDiagonalPrincipal = 0, sumatoriaDiagonalInvertida = 0;
        String aux;
        if (matrizParaSacarDiagonal.length == matrizParaSacarDiagonal[0].length) {
            //Sacando la sumatoria de la DIAGONAL PRINCIPAL ↘
            for (int renglon = 0; renglon < matrizParaSacarDiagonal.length; renglon++) {
                sumatoriaDiagonalPrincipal = sumatoriaDiagonalPrincipal + matrizParaSacarDiagonal[renglon][renglon];
            }
            //Sacando la sumatoria de la DIAGONAL INVERTIDA ↙
            for (int fila = 0, columna = matrizParaSacarDiagonal[0].length - 1; columna >= 0; fila++, columna--) {
                sumatoriaDiagonalInvertida = sumatoriaDiagonalInvertida + matrizParaSacarDiagonal[fila][columna];
            }
            aux = "La sumatoria de la diagonal PRINCIPAL es: " + sumatoriaDiagonalPrincipal + "\nLa sumatoria de la diagonal INVERTIDA es: " + sumatoriaDiagonalInvertida;
            JOptionPane.showMessageDialog(null, aux);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion, no es una matriz cuadrada");
        }

    }
    
}