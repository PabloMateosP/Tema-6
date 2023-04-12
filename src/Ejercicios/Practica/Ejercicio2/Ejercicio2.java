package Ejercicios.Practica.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        //Para añadir una nueva funcionalidad al código mediante un escaner damos los discos que moveremos.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de discos: ");
        int discos = sc.nextInt();
        sc.close();
        resolverTorres(discos, "A", "C", "B");
    }
    public static void resolverTorres(int n, String inicio, String fin, String medio) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde " + inicio + " hasta " + fin);
        } else {
            resolverTorres(n - 1, inicio, medio, fin);
            System.out.println("Mover disco " + n + " desde " + inicio + " hasta " + fin);
            resolverTorres(n - 1, medio, fin, inicio);
        }
    }
    //Con la recursividad del else lo que hacemos en nuestro código es cambiar las posiciones de las torres
    //para así ir intercambiando los discos de una torre a otra , cambiando el inicio por el fin y que cada vez que nuestra
    //n llegue a 1 entremos en el if.
}

