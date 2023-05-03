package practicaherencia;

import javax.swing.JOptionPane;

public class PracticaHerencia {

    public static void main(String[] args) {
        //Creando un objeto de la clase persona
        Persona ob1 = new Persona();
        ob1.capturar();
        JOptionPane.showMessageDialog(null, "DATOS DE LA PERSONA:" + ob1.mostrar());

        //Creando un objeto de la clase alumno
        Alumno ob2 = new Alumno();
        ob2.capturar();
        JOptionPane.showMessageDialog(null, "DATOS DEL ALUMNO:" + ob2.mostrar());

        //Creando un objeto de la clase maestro
        Maestro ob3 = new Maestro();
        ob3.capturar();
        JOptionPane.showMessageDialog(null, "DATOS DEL MAESTRO:" + ob3.mostrar());

        //Creando un objeto de la clase personal de vuelo
        PersonalVuelo ob4 = new PersonalVuelo();
        ob4.capturar();
        JOptionPane.showMessageDialog(null, "DATOS DEL PERSONAL DE VUELO:" + ob4.mostrar());

        //Creando un objeto de la clase piloto
        Piloto ob5 = new Piloto();
        ob5.capturar();
        JOptionPane.showMessageDialog(null, "DATOS DEL PILOTO:" + ob5.mostrar());

    }

}

class Persona {

    String nombre;
    byte edad;
    char genero;

    void capturar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la edad:"));
        String aux = JOptionPane.showInputDialog("Ingrese el genero: H para hombre M para Mujer");
        genero = aux.charAt(0);
    }

    String mostrar() {
        String aux;
        aux = "\nNombre: " + nombre + "\nEdad: " + edad + "\nGenero: " + genero;
        return (aux);
    }
}

class Alumno extends Persona {

    String noControl, carrera;
    byte semestre;

    void capturar() {
        super.capturar();
        noControl = JOptionPane.showInputDialog("Ingresa el numero de control:");
        semestre = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el semestre:"));
        carrera = JOptionPane.showInputDialog("Ingresa la carrera:");
    }

    String mostrar() {
        String aux;
        aux = super.mostrar() + "\nNumero de control: " + noControl + "\nSemestre: " + semestre + "\nCarrera: " + carrera;
        return (aux);
    }
}

class Maestro extends Persona {

    String materia, rfc;

    void capturar() {
        super.capturar();
        materia = JOptionPane.showInputDialog("Ingresa la materia impartida:");
        rfc = JOptionPane.showInputDialog("Ingresa el RFC:");
    }

    String mostrar() {
        String aux;
        aux = super.mostrar() + "\nMateria impartida: " + materia + "\nRFC: " + rfc;
        return (aux);
    }
}

class PersonalVuelo extends Persona {

    String aerolinea;
    byte añosServicio;

    void capturar() {
        super.capturar();
        aerolinea = JOptionPane.showInputDialog("Ingresa la aerolinea de trabajo:");
        añosServicio = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los años de servicio:"));
    }

    String mostrar() {
        String aux;
        aux = super.mostrar() + "\nAerolinea : " + aerolinea + "\nAños en servicio: " + añosServicio;
        return (aux);
    }
}

class Piloto extends PersonalVuelo {

    String avionEnUso;
    int horasVueloAcumuladas;

    void capturar() {
        super.capturar();
        avionEnUso = JOptionPane.showInputDialog("Ingresa el avion a pilotar:");
        horasVueloAcumuladas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas de vuelo acumuladas:"));
    }

    String mostrar() {
        String aux;
        aux = super.mostrar() + "\nAvion en uso: " + avionEnUso + "\nHoras de vuelo acumuladas: " + horasVueloAcumuladas;
        return (aux);
    }
}
