package Ejercicios.Ejercicio6_4;

import java.util.Arrays;

public class ProblemaMochilaFrac extends Esquema_voraz{

    private int n;
    private Integer max;
    private Integer pesoActual;

    private Integer[] pesos;
    private Integer[] valores;

    public ProblemaMochilaFrac(int n, Integer max, Integer[] pesos, Integer[] valores) {
        this.n = n;
        this.max = max;
        this.pesos = pesos;
        this.valores = valores;
    }

    @Override
    protected void anotaEnSolucion() {
        if (pesoActual + pesos[etapa] <= max){
            candidato = 1;
        } else {
            candidato = Double.valueOf(max - pesoActual)/pesos[etapa];
        }
        solucion[etapa] = candidato;

        pesoActual = pesoActual + pesos[etapa];
    }


    @Override
    protected boolean Fin() {
        return false;
    }

    @Override
    protected void anotaEnsolucion() {

    }

    @Override
    protected boolean esPrometedor() {
        return true;
    }

    @Override
    protected void seleccionaYEliminaCandidato() {
        double mayor = valores[0]/pesos[0];
        int i;
        for (i = 1;  i < n; i++) {
            if (mayor < Double.valueOf(valores[i]/pesos[i])) {
                mayor = Double.valueOf(valores[i])/pesos[i];
                etapa = i;
            }
        }

        valores[etapa] = 0;
    }

    @Override
    protected boolean fin() {
        return max == pesoActual;
    }


    @Override
    protected void inicializa() {
        solucion = new Object[n];
        Arrays.fill(solucion,0);
        pesoActual = 0;
    }
}

