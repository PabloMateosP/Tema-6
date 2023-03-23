package Ejercicios.Ejercicio6_4;

public abstract class Esquema_voraz {
    Object[] solucion;
    Object candidato;
    int etapa;
    public void voraz (){
        inicializa();
        while (!Fin()){
            seleccionaYEliminaCandidato();
            if(esPrometedor()){
                anotaEnsolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();

    protected abstract boolean Fin();

    protected abstract void anotaEnsolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();
}
