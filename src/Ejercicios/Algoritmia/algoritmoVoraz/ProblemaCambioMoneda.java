package Ejercicios.Algoritmia.algoritmoVoraz;

public class ProblemaCambioMoneda extends EsquemaAlgoritmoVoraz{

    int[] monedas;
    int candidato;
    int[] solucion;
    int cambio;
    int etapa;

    public ProblemaCambioMoneda(int[] monedas, int cambio) {
        this.monedas = monedas;
        this.cambio = cambio;
    }

    @Override
    protected boolean Fin() {
        return etapa == monedas.length;
    }

    @Override
    protected void anotaEnsolucion() {
        solucion[etapa] = candidato;
        cambio = cambio - monedas[etapa] * candidato;
        etapa ++;
    }

    @Override
    protected boolean esPrometedor() {

        return true;
    }

    @Override
    protected void seleccionaYEliminaCandidato() {
        candidato = cambio / monedas[etapa];

        //Siendo así si nuestro número es 30 y la monedas[etapa] es 10 nuestro cambio será 3.
    }
    @Override
    protected void inicializa() {
        solucion = new int[monedas.length];
        candidato = 0;
        etapa = 0;
    }
}
