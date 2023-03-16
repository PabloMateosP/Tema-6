package Ejercicios.algoritmoVoraz;


public abstract class EsquemaAlgoritmoVoraz {
    public void voraz (){
        inicializa();
        while (!Fin()){
            seleccionaYEliminaCandidato();
            if(esPrometedor()){
                anotaEnsolucion();
            }
        }
    }

    protected abstract boolean Fin();

    protected abstract void anotaEnsolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract void inicializa();
}
