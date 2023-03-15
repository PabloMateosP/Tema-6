package Ejercicios;

public class Ejercicio6_2 {
    public static void main(String[] args) {
        int n = 5;
        imprimirInverso(n);
        System.out.println(sumaNaturales(n));
    }
    //Ejercicio 1:
    //Crea una función que imprima los números naturales en orden inverso comenzando por el
    //número n.
    //Ejemplo:
    //Para n = 5 → 5, 4, 3, 2, 1
    public static void imprimirInverso(int n){
        if (n > 0) {
            //Caso recursivo
            System.out.print(n + ", " + " ");
            imprimirInverso(n - 1);
        } else {
            System.out.println("El número es menor que cero por lo tanto no es natural");
            //Caso Base
        }
    }
    //Ejercicio 2.
    //Calcula la suma de los primeros n números naturales utilizando recursividad.
    //Ejemplo:
    //sumaNaturales(5) = 1 + 2 + 3 + 4 + 5 = 15
    public static int sumaNaturales (int n){
        if (n > 0) {
            System.out.print(n );
            if (n > 1){
                System.out.print(" + ");
            }
            if (n == 1){
                System.out.print(" = ");
            }
            return n + sumaNaturales(n - 1);
        } else {
            return 0;
        }
    }
}
