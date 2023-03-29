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
    public static void resolverTorres(int n, String salida, String meta, String comodin) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde " + salida + " hasta " + meta);
            return;
        }
        resolverTorres(n - 1, salida, comodin, meta);
        System.out.println("Mover disco " + n + " desde " + salida + " hasta " + meta);
        resolverTorres(n - 1, comodin, meta, salida);
    }
}

