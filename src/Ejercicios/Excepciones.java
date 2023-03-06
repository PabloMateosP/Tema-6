package Ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones {
    //Crea un método invocado desde el main que lea un fichero de la ruta pasada
    //como parámetro, usando este código:

    public static void main(String[] args){
        try {
            lector("libro");
        } catch (FileNotFoundException e) {
            System.out.println("Fallo FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Fallo IOException");
        }
    }
    private static void lector (String libro) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(libro);
        System.out.println(fileReader.read());
        fileReader.close();
    }
}
