    package Ejercicios;
//        1. ¿Cuál es el nombre en Java de la clase que define las excepciones, y de la que debe
//        heredar cualquier clase que queramos usar para representar una excepción?
// En java la clase que define las excepciones se llama "Throwable"

//        2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen
//        al invocar un método de un objeto cuyo valor es “null”?
// Se llama la clase NullPointerException

//        3. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen
//        al obtener un comportamiento anómalo en la entrada / salida de información?
// Se llama IOException

//        4. Observa el siguiente fragmento de código:
//        String [] array_string = new String [25];
//        System.out.println (array_string [3].length());
//        ¿Qué excepción se produciría en el mismo?
// Se producirá una excepción nullpointerException, ya que nuestro array no está definido con valores por lo tanto está completo de valores nulos.

//        5. Observa el siguiente fragmento de código:
//        String aux = “hola”;
//        int aux2 = Integer.parseInt (aux);
//        ¿Qué sucedería al ejecutar el mismo?
// Va a dar una excepción siendo esta NumberFormatException, ya que no se puede convertir mediante el parseInt la cadena hola a un entero como tal sino que
    // esa cadena debería de ser un número

//        6. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente
//        acción:
//        Recibe como parámetros una cadena (String) y un entero (int);
//        Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length():
//        int” de la clase “String”) devuelve el carácter en la posición correspondiente (puedes hacer
//        uso del método “charAt(int)” de la clase “String”).
//        En caso contrario, construye y lanza una excepción de tipo “Exception”
    public class Ejercicio6_1 {
        public static void main(String[] args) throws Exception {

            String cadena = "Dobby";
            //int entero = 4; si nuestro número fuera cuatro nos daría la letra y
            int entero = 0; //Si este entero fuera menos uno o 5 ya daría una IllegalArgumentException

            try{
                char caracter = caracterEn(cadena, entero);
                System.out.println("El caracter de la posición introducida es " + "'" + caracter + "'");
            } catch (Exception excp) {
                excp.printStackTrace();
                System.out.println(excp.getMessage());
            }
        }
        public static char caracterEn (String cadena, int entero) throws IllegalArgumentException{
            if (entero >= 0 && entero < cadena.length()){
                return cadena.charAt(entero);
            } else if (entero < 0){
                throw new IllegalArgumentException("Número menor que la longitud necesitada");
            } else{
                throw new IllegalArgumentException("Número mayor que la longitud necesitada");
            }
        }
    }
