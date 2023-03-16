package Ejercicios;

public class Ejercicio6_2 {
    public static void main(String[] args) {
        int n = 5;
        int n2 = 7;
        imprimirInverso(n);
        System.out.println(sumaNaturales(n));
        System.out.println(sucesionFibonacci(n2));
        System.out.println(MCD(8 , 6 ));
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
    //Ejercicio 3.
    //Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci.
    //Esta sucesión se caracteriza por estar definida naturalmente de manera recursiva, pues
    //consiste en que cada número de la sucesión se obtiene sumando los dos enteros positivos
    //que le preceden, comenzando la sucesión por los números 0 y 1. Por lo tanto tendría la
    //siguiente forma:
    //        0, 1, 1, 2, 3, 5, 8, 13, 21, 34…. hasta n
    //Teóricamente podría definirse así:
    //fibonacci(0) = 0
    //fibonacci(1) = 1
    //fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
    public static int sucesionFibonacci(int n){
        if (n < 2){
            return n;
        } else{
            return sucesionFibonacci(n - 1) + sucesionFibonacci(n - 2);
        }
    }
    public static int MCD (int a, int b){
        if (a == 0 || b == 0){
            return b;
        } else {
            return MCD (b, b % a);
        }
    }
}
