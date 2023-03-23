package Ejercicios.Algoritmia.DyV;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;

public class EjemploDyV {
    public static void main(String[] args) {
        //Para una búsqueda binaria nuestro array debe de estar ordenado
        int [] a = {-2, -1, 3, 5, 8, 10};
        int num = 5;
        int pos = dyv(a, num);
        System.out.println("El número " + num + " está en la posición " + pos);
        int pos2 = dyvCorreccion(a, num);
        System.out.println("El número " + num + " está en la posición " + pos2);
    }
    private static int dyv (int [] a, int num){
        int medio = a.length / 2;
        if (a[medio] == num){
            return medio;
        } else if (num < a[medio]) {
            return dyv(Arrays.copyOfRange(a, 0, medio), num);
        } else
        return dyv(Arrays.copyOfRange(a, medio + 1, a.length), num);
    }
    public static int lineal (int[] a, int num){
        int pos = -1;
        for (int i = 0; i < a.length; i++){
            if (num == a[i]){
                pos = 1;
                break;
            }
        }
        return pos;
    }
    public static int dyvCorreccion(int[] a, int num){
        int pos = a.length / 2;
        if (a.length == 0){
            return -1;
        } else if (num == a[pos]) {
            return pos;
        } else if (num > a[pos]) {
            return pos + 1 + dyvCorreccion(Arrays.copyOfRange(a, pos + 1, a.length), num);
        } else {
            return dyvCorreccion(Arrays.copyOfRange(a, 0, pos), num);
        }
    }
}
