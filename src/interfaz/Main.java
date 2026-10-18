package interfaz;

import negocio.Carro;

public class Main {
    public static void main(String[] args) {
        Carro c1; // creando una referencia a un objeto de la clase Carro
        c1 = new Carro(); // creando el objeto y asignando

        c1.potencia = 5;
        c1.acelerar();
    }
}