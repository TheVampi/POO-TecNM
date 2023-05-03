package practicaherencia;

import javax.swing.JOptionPane;

public class PracticaHerencia {

    static void afinarTodo(Instrumento[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println("Es un instrumento de tipo: " + e[i].tipo());
            e[i].afinar();
        }
    }

    public static void main(String[] args) {

        //Declarando un arreglo de n elementos
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de intrumentos deseados para la orquesta"));
        Instrumento[] orquesta = new Instrumento[n];

        int ins = 0;
        for (int i = 0; i < orquesta.length; i++) {
            
                ins = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el intrumento #" + (i + 1) + ": \n1. Guitarra\n2. Piano\n3. Saxofon\n4. Guzla\n5. Ukelele"));
            
            switch (ins) {
                case 1:
                    orquesta[i] = new Guitarra();
                    break;
                case 2:
                    orquesta[i] = new Piano();
                    break;

                case 3:
                    orquesta[i] = new Saxofon();
                    break;

                case 4:
                    orquesta[i] = new Guzla();
                    break;

                case 5:
                    orquesta[i] = new Ukelele();
                    break;
            }
        }
        
        //Ejecutando la funcion orquesta
        afinarTodo(orquesta);
    }
}

//Esta es la clase padre y abstracta
abstract class Instrumento {

    public abstract void tocar();

    public String tipo() {
        return "Instrumento";
    }

    public abstract void afinar();
}

class Guitarra extends Instrumento {

    public void tocar() {
        System.out.println("Guitarra.tocar()");
    }

    public String tipo() {
        return "Guitarra";
    }

    public void afinar() {

    }
}

class Piano extends Instrumento {

    public void tocar() {
        System.out.println("Piano.tocar()");
    }

    public String tipo() {
        return "Piano";
    }

    public void afinar() {

    }
}

class Saxofon extends Instrumento {

    public void tocar() {
        System.out.println("Saxofon.tocar()");
    }

    public String tipo() {
        return "Saxofon";
    }

    public void afinar() {
    }
}

//Heredando de la clase guitarra, y a su vez guitarra
class Guzla extends Guitarra {

    public void tocar() {
        System.out.println("Guitarra Guzla.tocar()");
    }

    public void afinar() {
        System.out.println("Guzla.afinar()");
    }
}

//Heredando de la clase guitarra, y a su vez guitarra
class Ukelele extends Guitarra {

    public void tocar() {
        System.out.println("Guitarra Ukelele.tocar()");
    }

    public String tipo() {
        return "Ukelele";
    }
}
