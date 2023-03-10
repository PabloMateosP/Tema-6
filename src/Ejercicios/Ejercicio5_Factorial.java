package Ejercicios;

public class Ejercicio5_Factorial {
    public static void main(String[] args) {
        factorial2(5);
        System.out.println(factorial(5));
    }
    private static int factorial(int i) {
        if (i > 0) {
            return i * factorial(i - 1);
        } else {
            return 1;
        }

    }
    private static void factorial2(int i){
        int o = 1;
        for (int x = i; x > 0; x--){
            o = o * x;

        }System.out.println(o);
    }
}
