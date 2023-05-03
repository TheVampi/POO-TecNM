package tarea_3_1;

import javax.swing.JOptionPane;

public class Tarea_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generando un cuadrado
        Cuadrado ob1 = new Cuadrado();
        ob1.capturarDatos();
        ob1.calcularArea();
        ob1.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob1.mostrar());
        
        //Generando un rectangulo
        Rectangulo ob2 = new Rectangulo();
        ob2.capturarDatos();
        ob2.calcularArea();
        ob2.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob2.mostrar());
        
        //Generando un circulo
        Circulo ob3 = new Circulo();
        ob3.capturarDatos();
        ob3.calcularArea();
        ob3.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob3.mostrar());
        
        //Generando un triangulo equilatero
        TrianguloEquilatero ob4 = new TrianguloEquilatero();
        ob4.capturarDatos();
        ob4.calcularArea();
        ob4.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob4.mostrar());
        
        //Generando un triangulo isosceles
        TrianguloIsosceles ob5 = new TrianguloIsosceles();
        ob5.capturarDatos();
        ob5.calcularArea();
        ob5.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob5.mostrar());
        
        //Generando un triangulo escaleno
        TrianguloEscaleno ob6 = new TrianguloEscaleno();
        ob6.capturarDatos();
        ob6.calcularArea();
        ob6.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob6.mostrar());
        
        //Generando un triangulo escaleno
        TrianguloRectangulo ob7 = new TrianguloRectangulo();
        ob7.capturarDatos();
        ob7.calcularArea();
        ob7.calcularPerimetro();
        JOptionPane.showMessageDialog(null, ob7.mostrar());
    }

}

abstract class FiguraGeometrica {

    byte lados;
    String nombreFigura;
    double area, perimetro;

    public String mostrar() {
        return ("Esta figura es: ");
    }

    public abstract void capturarDatos();

    public abstract void calcularArea();

    public abstract void calcularPerimetro();
}

class Cuadrado extends FiguraGeometrica {

    double medidaLado;

    public void capturarDatos() {
        medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de los lados"));
        lados = 4;
    }

    public void calcularArea() {
        area = medidaLado * medidaLado;
    }

    public void calcularPerimetro() {
        perimetro = medidaLado * 4;
    }

    public String mostrar() {
        nombreFigura = "CUADRADO";
        return (super.mostrar() + "un " + nombreFigura + " que tiene un area de: " + area + " , perimetro de: " + perimetro + " y que por supuesto tiene: " + lados + " lados, cada uno mide: " + medidaLado);
    }
}

class Rectangulo extends FiguraGeometrica {

    double base, altura;

    public void capturarDatos() {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de la altura"));
        lados = 4;
    }

    public void calcularArea() {
        area = base * altura;
    }

    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
    }

    public String mostrar() {
        nombreFigura = "RECTANGULO";
        return (super.mostrar() + "un " + nombreFigura + " que tiene un area de: " + area + " , perimetro de: " + perimetro + " y que por supuesto tiene: " + lados + " lados, su base mide: " + base + " y su altura mide: " + altura);
    }
}

class Circulo extends FiguraGeometrica {

    double radio;

    public void capturarDatos() {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del radio: "));
    }

    public void calcularArea() {
        area = Math.PI * (Math.pow(radio, 2));
    }

    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    public String mostrar() {
        nombreFigura = "CIRCULO";
        return (super.mostrar() + "un " + nombreFigura + " que tiene un area de: " + area + " , perimetro de: " + perimetro + " por lo tanto su radio es de: " + radio);
    }

}

abstract class Triangulo extends FiguraGeometrica {

    public String mostrar() {
        lados = 3;
        return (super.mostrar() + "un TRIANGULO, es decir que tiene" + lados + " y es de tipo: ");
    }
}

class TrianguloEquilatero extends Triangulo {

    double medidaLado;

    public void capturarDatos() {
        medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de un lado: "));
    }

    public void calcularArea() {
        area = ((Math.sqrt(3)) / (4)) * (Math.pow(medidaLado, 2));
    }

    public void calcularPerimetro() {
        perimetro = medidaLado * 3;
    }

    public String mostrar() {
        nombreFigura = "TRIANGULO EQUILATERO";
        return (super.mostrar() + nombreFigura + " todos sus lados miden: " + medidaLado + " , tiene area de: " + area + " y perimetro de: " + perimetro);
    }
}

class TrianguloIsosceles extends Triangulo {

    double dosLados, ladoIndep;

    public void capturarDatos() {
        dosLados = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de los dos lados iguales: "));
        ladoIndep = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del lado independiente: "));
    }

    public void calcularArea() {
        area = ((ladoIndep) * (Math.sqrt((Math.pow(dosLados, 2)) - ((Math.pow(ladoIndep, 2)) / (4))))) / (2);
    }

    public void calcularPerimetro() {
        perimetro = (2 * dosLados) + (ladoIndep);
    }

    public String mostrar() {
        nombreFigura = "TRIANGULO ISOSCELES";
        return (super.mostrar() + nombreFigura + " dos de sus lados miden: " + dosLados + " , un lado mide: " + ladoIndep + " , tiene area de: " + area + " y perimetro de: " + perimetro);
    }
}

class TrianguloEscaleno extends Triangulo {

    double a, b, c;

    public void capturarDatos() {
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de un lado A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de un lado B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de un lado C: "));
    }

    public void calcularArea() {
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void calcularPerimetro() {
        perimetro = a + b + c;
    }

    public String mostrar() {
        nombreFigura = "TRIANGULO ESCALENO";
        return (super.mostrar() + nombreFigura + " el lado A mide: " + a + " el lado B mide: " + b + " el lado C mide: " + c + " , tiene area de: " + area + " y perimetro de: " + perimetro);
    }
}

class TrianguloRectangulo extends Triangulo {

    double a, b;

    public void capturarDatos() {
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de la base: "));
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de la altura: "));
    }

    public void calcularArea() {
        area = (b * a) / 2;
    }

    public void calcularPerimetro() {
        perimetro = a + b + Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
    }

    public String mostrar() {
        nombreFigura = "TRIANGULO RECTANGULO";
        return (super.mostrar() + nombreFigura + " la base mide: " + b + " la altura mide: " + a + " , tiene area de: " + area + " y perimetro de: " + perimetro);
    }
}
