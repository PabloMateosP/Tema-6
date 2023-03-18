package Ejercicios;

import java.util.Arrays;

public class Ejercicio6_4 {
    public static void main(String[] args) {
        int m = 100;
        int n = 5;
        int [] w = {10, 20, 30, 40, 50};
        int [] v = {20, 30, 66, 40, 60};
        System.out.println(Arrays.toString(llenarMochila(m,n, w, v)));
    }
    public static int[] llenarMochila(int m, int n, int[] w, int[] v) {
        int[] x = new int[n]; // Inicializamos el vector de fracciones a 0
        //Si hiciéramos nuestro programa con valores double sería más preciso.

        // Calculamos la eficiencia de cada objeto (valor por unidad de peso)
        int[] eficiencia = new int[n];
        for (int i = 0; i < n; i++) {
            eficiencia[i] = v[i] / w[i];
            //La eficiencia queda definida entre la división de valores del array v y w
        }

        // Ordenamos los objetos de mayor a menor eficiencia
        // Con este proceso vamos guardando temporalmente valores dados mientras seguimos el bucle
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (eficiencia[i] < eficiencia[j]) {
                    int tempEfi = eficiencia[i];
                    eficiencia[i] = eficiencia[j];
                    eficiencia[j] = tempEfi;

                    int tempW = w[i];
                    w[i] = w[j];
                    w[j] = tempW;

                    int tempV = v[i];
                    v[i] = v[j];
                    v[j] = tempV;
                }
            }
        }

        // Llenamos la mochila con los objetos más eficientes hasta que esté llena
        int pesoActual = 0;
        int i = 0;
        while (pesoActual < m && i < n) {
            if (pesoActual + w[i] <= m) { // Si cabe completo el objeto
                x[i] = 1;
                pesoActual += w[i];
            } else { // Si no cabe completo una fracción del objeto
                x[i] = (m - pesoActual) / w[i];
                pesoActual = m;
            }
            i++;
        }

        return x;
    }

}
