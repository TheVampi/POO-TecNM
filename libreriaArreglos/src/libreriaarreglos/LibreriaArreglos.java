package libreriaarreglos;

import javax.swing.JOptionPane;


/*⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄
⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄
⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄
⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄
⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰
⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤
⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗
⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄
⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄
⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄
⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄
⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄
⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄
⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴
⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿
    
    
   LIBRERIAS DE MATRICES uwu
⠀⠀⠘⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠀⠀⠀
⠀⠀⠀⠑⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⠀⠀
⠀⠀⠀⠀⠈⠢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠊⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⢀⣀⣀⣀⣀⣀⡀⠤⠄⠒⠈⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠘⣀⠄⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀
⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠋⠉⠈⠉⠉⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿
⣿⣿⣿⣿⡏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿
⣿⣿⣿⢏⣴⣿⣷⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿
⣿⣿⣟⣾⣿⡟⠁⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣷⢢⠀⠀⠀⠀⠀⠀⠀⢸⣿
⣿⣿⣿⣿⣟⠀⡴⠄⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⣿
⣿⣿⣿⠟⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠶⢴⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⣿
⣿⣁⡀⠀⠀⢰⢠⣦⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⡄⠀⣴⣶⣿⡄⣿
⣿⡋⠀⠀⠀⠎⢸⣿⡆⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⠗⢘⣿⣟⠛⠿⣼
⣿⣿⠋⢀⡌⢰⣿⡿⢿⡀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣧⢀⣼
⣿⣿⣷⢻⠄⠘⠛⠋⠛⠃⠀⠀⠀⠀⠀⢿⣧⠈⠉⠙⠛⠋⠀⠀⠀⣿⣿⣿⣿⣿
⣿⣿⣧⠀⠈⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⠀⠀⠀⢀⢃⠀⠀⢸⣿⣿⣿⣿
⣿⣿⡿⠀⠴⢗⣠⣤⣴⡶⠶⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡸⠀⣿⣿⣿⣿
⣿⣿⣿⡀⢠⣾⣿⠏⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠉⠀⣿⣿⣿⣿
⣿⣿⣿⣧⠈⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿
⣿⣿⣿⣿⡄⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣦⣄⣀⣀⣀⣀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠙⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠁⠀⠀⠹⣿⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⢻⣿⡇⠀⠀⠀⠀⠀⠀⢀⠈⣿⣿⡿⠉⠛⠛⠛⠉⠉
⣿⡿⠋⠁⠀⠀⢀⣀⣠⡴⣸⣿⣇⡄⠀⠀⠀⠀⢀⡿⠄⠙⠛⠀⣀⣠⣤⣤⠄⠀      
 */
public class LibreriaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //AQUI VAMOS A PROBAR CADA FUNCION UWU
        Matrices objeto1 = new Matrices();
        /*JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de matrices, vamos a crear la primer matriz");
        //Creando y leyendo la primera matriz
        int[][] matriz1;
        matriz1 = objeto1.leerMatriz();
        //JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matriz1));
        //Creando y leyendo la segunda matriz
        JOptionPane.showMessageDialog(null, "Ahora vamos a crear la segunda matriz");
        int[][] matriz2;
        matriz2 = objeto1.leerMatriz();
        //JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matriz2));

        //Calculando la suma de la primera y la segunda
        int[][] matriz3 = new int[matriz1.length][matriz1[0].length];
        objeto1.sumarMatriz(matriz1, matriz2, matriz3);

        //Calculando la RESTA de la PRIMERA menos la SEGUNDA
        int[][] matriz4 = new int[matriz1.length][matriz1[0].length];
        objeto1.restarMatriz(matriz1, matriz2, matriz4);

        //Calculando la RESTA de la SEGUNDA menos la PRIMERA
        int[][] matriz5 = new int[matriz1.length][matriz1[0].length];
        objeto1.restarMatriz(matriz2, matriz1, matriz5);*/

        /*//Calculando la suma de cada renglon y mostrandola al final de cada columna de cada renglon
        int[][] matriz9;
        matriz9 = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.sumarYMostrarRenglones(matriz9));*/

        /*//Creando una matriz para rellenar con multiplos de 3
        int[][] matrizMultiplosDe3;
        matrizMultiplosDe3 = objeto1.asignarDimensionesAArreglo();
        matrizMultiplosDe3 = objeto1.llenarMatrizEsquinaSuperiorDerecha(matrizMultiplosDe3);*/
        
        //Creando una matriz para rellenar con multiplos de 3
        int[][] matrizMultiplosDe3V2;
        matrizMultiplosDe3V2 = objeto1.asignarDimensionesAArreglo();
        matrizMultiplosDe3V2 = objeto1.llenarMatrizEsquinaInferiorDerecha(matrizMultiplosDe3V2);
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matrizMultiplosDe3V2));

        /*//Mostrando los resultados finales
        JOptionPane.showMessageDialog(null, "Matriz 1\n" + objeto1.mostrarMatriz(matriz1) + "\n\nMatriz 2:\n" + objeto1.mostrarMatriz(matriz2) + "\n\nMatriz 1 + Matriz 2:\n" + objeto1.mostrarMatriz(matriz3) + "\n\nMatriz 1 - Matriz 2:\n" + objeto1.mostrarMatriz(matriz4) + "\n\nMatriz 2 - Matriz 1:\n" + objeto1.mostrarMatriz(matriz5) + "\n\nMatriz llenada con multiplos de 3:\n" + objeto1.mostrarMatriz(matrizMultiplosDe3));

        //Sumando las diagonales normal e invertida una matriz cuadrada
        int[][] matrizDiagonal;
        matrizDiagonal = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matrizDiagonal));
        objeto1.obtenerSumaDiagonalMatrizCuadrada(matrizDiagonal);

        //Ordenando un arreglo de tipo ENTERO CON METODO BURBUJA
        objeto1.ordenamientoMetodoBurbuja();

        //Ordenando un arreglo de 2 dimensiones de MENOR A MAYOR UTILIZANDO METODO DE LA BURBUJA
        int[][] arregloParaOrdenar;
        arregloParaOrdenar = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arregloParaOrdenar));
        objeto1.arregloDosDimensionesOrdenado(arregloParaOrdenar);
        JOptionPane.showMessageDialog(null, "Arreglo ordenado de menor a mayor: \n" + objeto1.mostrarMatriz(arregloParaOrdenar));

        //Obteniendo una matriz transpuesta de dimensiones n*n
        int[][] arregloParaTransponer;
        arregloParaTransponer = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arregloParaTransponer));
        arregloParaTransponer = objeto1.obtenerMatrizTranspuesta(arregloParaTransponer);
        JOptionPane.showMessageDialog(null, "RESULTADO MATRIZ TRANSPUESTA:\n" + objeto1.mostrarMatriz(arregloParaTransponer));
        
        int [][] arregloParaOrdenarPorFilas;
        arregloParaOrdenarPorFilas = objeto1.leerMatriz();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arregloParaOrdenarPorFilas));
        objeto1.ordenarArregloMenorAMayorPorRenglon(arregloParaOrdenarPorFilas);
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(arregloParaOrdenarPorFilas));
        
        //Lenando matriz con random
        int [][] matrizParaLlenarConRandom;
        matrizParaLlenarConRandom = objeto1.leerMatrizYLlenarRandom();
        JOptionPane.showMessageDialog(null, objeto1.mostrarMatriz(matrizParaLlenarConRandom));

        //Matriz del cuadrado magico
        int[][] matrizParaCuadrado;
        matrizParaCuadrado = objeto1.asignarDimensionesAArreglo();
        objeto1.rellenarCuadroMagico(matrizParaCuadrado);*/
    }

}

class Matrices {

    //Asignar dimensiones a un arreglo
    int[][] asignarDimensionesAArreglo() {
        //Pidiendo las dimensiones del arreglo
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        //Creando el arreglo
        int[][] unArreglo = new int[filas][columnas];
        return (unArreglo);
    }

    //Metodo para pedir y asignar datos a una matriz
    int[][] leerMatriz() {
        int filas, columnas;
        //Pidiendo las dimensiones del arreglo
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        //Creando el arreglo
        int[][] unArreglo = new int[filas][columnas];

        //Llenando con datos
        for (int filaParaLlenar = 0; filaParaLlenar < unArreglo.length; filaParaLlenar++) {
            for (int columnaParaLlenar = 0; columnaParaLlenar < unArreglo[0].length; columnaParaLlenar++) {
                unArreglo[filaParaLlenar][columnaParaLlenar] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la fila " + (filaParaLlenar + 1) + " columna " + (columnaParaLlenar + 1)));
            }
        }
        return (unArreglo);
    }

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
                unArreglo[filaParaLlenar][columnaParaLlenar] = (int) (Math.random() * (10 + 1) + (0)); //Math.random() * (valor maximo + 1) + (valor minimo)
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

    //Metodo para multiplicar matrices
    void multiplicarMatriz(int[][] PrimerMatriz, int[][] SegundaMatriz, int[][] matrizResultante) {
        /*Criterios para la multiplicacion de matrices:
            1. Dadas 2 matrices para multiplicar, se va a obtener una nueva matriz resultante
            2. Las FILAS DE LA SEGUNDA matriz debe ser del MISMO ORDEN DE LA COLUMNA DE LA PRIMERA, si no se cumple este requisito, no se puede realizar la operacion
            3. Las FILAS DE LA MATRIZ RESULTANTE debe tener el MISMO ORDEN DE FILAS de la PRIMER MATRIZ
            4. Las COLUMNAS DE LA MATRIZ RESULTANTE debe tener el MISMO ORDEN DE COLUMNAS DE LA SEGUNDA MATRIZ
         */
        if (PrimerMatriz[0].length == SegundaMatriz.length) {

        } else {
            JOptionPane.showMessageDialog(null, "Las operaciones no pueden realizarse, la primer matriz tiene " + PrimerMatriz[0].length + " columnas, y la segunda matriz tiene " + SegundaMatriz.length + " filas, no son iguales unu");
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

    //Metodo para rellenar matrices con multiplos de 3 (EMPEZANDO ESQUINA SUPERIOR DERECHA)en esta forma: ← ↓ → ↓ ← ...
    int[][] llenarMatrizEsquinaSuperiorDerecha(int[][] matrizAEvaluar) {
        JOptionPane.showMessageDialog(null, "Vamos a rellenar una matriz con multiplos de 3");
        int[][] unArreglo = new int[matrizAEvaluar.length][matrizAEvaluar[0].length];
        int multiplo = 3;
        boolean bandera = true;
        for (int fila = 0; fila < matrizAEvaluar.length; fila++) {

            if (bandera) {
                for (int columna = matrizAEvaluar[0].length - 1; columna >= 0; columna--) {
                    unArreglo[fila][columna] = multiplo;
                    multiplo = multiplo + 3;
                }
                bandera = false;
            } else {
                for (int columna = 0; columna < matrizAEvaluar[0].length; columna++) {
                    unArreglo[fila][columna] = multiplo;
                    multiplo = multiplo + 3;

                }
                bandera = true;
            }
        }
        return (unArreglo);
    }

    //Metodo para rellenar matrices con multiplos de 3 (EMPEZANDO ESQUINA INFERIOR DERECHA)en esta forma: ← ↓ → ↓ ← ...
    int[][] llenarMatrizEsquinaInferiorDerecha(int[][] matrizAEvaluar) {
        JOptionPane.showMessageDialog(null, "Vamos a rellenar una matriz con multiplos de 3");
        int[][] unArreglo = new int[matrizAEvaluar.length][matrizAEvaluar[0].length];
        int multiplo = 3;
        boolean bandera = true;
        for (int fila = (matrizAEvaluar.length-1); fila >= 0; fila--) {

            if (bandera) {
                for (int columna = matrizAEvaluar[fila].length-1 ; columna >=0 ; columna--) {
                    unArreglo[fila][columna] = multiplo;
                    multiplo = multiplo + 3;
                }
                bandera = false;
            } else {
                for (int columna = 0 ; columna <matrizAEvaluar[fila].length; columna++) {
                    unArreglo[fila][columna] = multiplo;
                    multiplo = multiplo + 3;

                }
                bandera = true;
            }
        }
        return (unArreglo);
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

    //METODO BURBUJA para ordenar arreglos de UNA DIMENSION (DE TIPO INT)
    void ordenamientoMetodoBurbuja() {

        int variableAuxiliar;

        //Asignando la cantidad 
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Teclea numero de elementos para el arreglo"));

        //Creacion del arreglo
        int[] arreglo = new int[filas];
        //Asignando valores
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor entero" + (i + 1)));
        }

        //Ordenandolos elementos
        for (int pasadas = 1; pasadas < arreglo.length; pasadas++) {
            for (int comparaciones = 1; comparaciones <= arreglo.length - 1; comparaciones++) {

                if (arreglo[comparaciones - 1] > arreglo[comparaciones]) {
                    variableAuxiliar = arreglo[comparaciones - 1];
                    arreglo[comparaciones - 1] = arreglo[comparaciones];
                    arreglo[comparaciones] = variableAuxiliar;
                }

                //LO SIGUIENTE ES PARA VERIFICAR EN CONSOLA COMO FUNCIONA EL ALGORITMO EN LAS COMPARACIONES
                //La siguiente linea es solo para verificar en consola
                System.out.println("Comparacion Actual:" + comparaciones);

                //Mostrando los resultados ordenados del arreglo
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println(arreglo[i]);
                }
            }//AQUI TERMINA CICLO DE COMPARACIONES

            //LO SIGUIENTE ES PARA VERIFICAR EN CONSOLA COMO FUNCIONA EL ALGORITMO EN LAS PASADAS
            //La siguiente linea es solo para verificar en consola
            System.out.println("Pasada actual:" + pasadas);

            //Mostrando los resultados ordenados del arreglo EN CONSOLA
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
        }//AQUI TERMINA CICLO DE PASADAS

        //Mostrando los resultados FINALES ordenados del arreglo ESTO SE MUESTRA EN CONSOLA
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        //Mostrando los resultados FINALES ordenados del arreglo en un JOption
        String aux = "Arreglo ordenado: \n";
        for (int i = 0; i < arreglo.length; i++) {
            aux = aux + arreglo[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, aux);
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

    //Metodo para ordenar un arreglo de menor a mayor por cada renglon
    void ordenarArregloMenorAMayorPorRenglon(int[][] matrizAOrdenar) {
        for (int renglon = 0; renglon < matrizAOrdenar.length; renglon++) {
            //Acomodando cada renglon por metodo Burbuja
            //Declarando un array de una dimension de longitud n columnas de acuerdo renglon original
            int[] arregloBurbuja = new int[matrizAOrdenar[renglon].length];

            //Llenando el arreglo de una dimension de acuerdo al renglon que se esta iterando
            int posicion = 0;
            for (int columna = 0; columna < matrizAOrdenar[renglon].length; columna++) {
                arregloBurbuja[posicion] = matrizAOrdenar[renglon][columna];
                posicion++;
            }

            //Ordenando el renglon con metodo burbuja
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

            //Asignando los valores al renglon del arreglo original
            posicion = 0;
            for (int columna = 0; columna < matrizAOrdenar[renglon].length; columna++) {
                matrizAOrdenar[renglon][columna] = arregloBurbuja[posicion];
                posicion++;
            }

        }

    }

    //Metodo CUADRO MAGICO
    /*void rellenarCuadroMagico(int[][] matrizParaMagico) {
        if((matrizParaMagico.length==matrizParaMagico[0].length) & (matrizParaMagico.length%2!=0)){
            int numero = 1;
            int renglonInicial =0;
            int columna = (matrizParaMagico.length/2);
            int renglonAnterior = matrizParaMagico.length - 1;
            int renglonSiguiente = 0;
            int columnaAnterior = 0;
            
            
            boolean bandera =true;
            do{
                
                if (bandera = true){
                    if (renglon){
                        
                    }
                   matrizParaMagico[renglonInicial][]=numero;
                }
                
                numero++;
            }while(numero <= matrizParaMagico.length*matrizParaMagico.length);
        }
        
    }*/
}
