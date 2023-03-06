public class ManejoDeExcepciones {
    public static void main(String[] args) {
        System.out.println("Comienzo programa división");
        try {
            int dividiendo = 5;
            int divisor = 0;
            System.out.println("Resultado: " + dividiendo / divisor);
        } catch (ArithmeticException ex) {
            System.out.println("Imposible dividir por 0");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Fin programa división");
        }
    }
}
