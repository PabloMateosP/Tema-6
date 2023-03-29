package Ejercicios.Practica.Ejercicio1;

import java.io.IOException;


public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            metodoExcepcion();
        } catch (ExcepcionPropia e) {
            System.out.println("Ocurrió una excepción propia: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        }
    }
    public static void metodoExcepcion() throws ExcepcionPropia, IOException {
        throw new ExcepcionPropia("Se produjo la excepción propia");
    }
}

