package Ejercicios;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

//Meter un número en una lista
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);

        Integer nuevoNumero = 6;
        añadirNumero(lista, nuevoNumero);
    }
    static void añadirNumero(List <Integer> lista, Integer nuevoNumero){
        if (lista.contains(nuevoNumero)) {
            throw new IOError("La lista ya contiene el número");

        }
    }
}
