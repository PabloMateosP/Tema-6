package Ejercicios.algoritmoVoraz;

import java.util.Arrays;

public class ProblemaRealCambioMonedas {
    public static void main(String[] args) {
        int [] monedas = {50, 20, 10, 5, 1};
        int cambio = 38;
        ProblemaCambioMoneda pcn = new ProblemaCambioMoneda(monedas, cambio);
        pcn.voraz();
        System.out.println(Arrays.toString(pcn.solucion));
    }
}
