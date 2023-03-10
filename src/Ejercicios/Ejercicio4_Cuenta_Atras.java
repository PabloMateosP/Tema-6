package Ejercicios;

public class Ejercicio4_Cuenta_Atras {
    public static void main(String[] args) {
        int i = 10;
        cuentaAtras(i);
        cuentaAtras2(i);
    }
    // Recursiva
    private static void cuentaAtras(int i ){
        if (i > 0) {
            System.out.println(i);
            cuentaAtras(i -1);
        } else
            System.out.println("Fin!!!");
    }

    // Iterativo
    private static void cuentaAtras2(int i){
        while (i > 0){
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("Fin!!!");
    }
}
