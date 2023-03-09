package Ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Meter un número en una lista
public class Ejercicio2 {
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);

        Integer nuevoNumero = 6;
        try {
            addNumber(lista, nuevoNumero);
        } catch (NoRepetidoException e) {
            throw new RuntimeException(e);
        }

    }
    static void addNumber(List <Integer> lista, Integer nuevoNumero) throws NoRepetidoException {
        if (lista.contains(nuevoNumero)) {
            throw new NoRepetidoException("La lista ya contiene el número");
        } else {
            lista.add(nuevoNumero);
            System.out.println("Nuevo número añadido");
        }
    }
}
