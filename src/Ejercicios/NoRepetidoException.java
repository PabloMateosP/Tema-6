package Ejercicios;

public class NoRepetidoException extends Throwable {
    public NoRepetidoException(String s) {
        System.out.println("Número repetido");
    }
}
