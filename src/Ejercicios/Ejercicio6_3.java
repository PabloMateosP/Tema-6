package Ejercicios;
import java.util.Arrays;

public class Ejercicio6_3 {
    public static void main(String[] args) {
        System.out.println("Primer ejercicio");
        int[] numbers = {1,4,7,9,12,14};
        System.out.println("Nuestro mayor número del arrya: " + Arrays.toString(numbers) + " es " + highnumber(numbers));
        System.out.println(" ");
        System.out.println("Segundo ejercicio");
        System.out.println("Como notación big-O podriamos decir que este es uno de los métodos más rapidos que he encontrado para conocer el número más grande presente\naún así sin ser logaritmo existirán clases que harán este trabajo por nosotros.");
        System.out.println(" ");
        System.out.println("Tercer ejercicio");
        System.out.println("En este caso, sí influirá la cantidad de recursos ya que nuestro código mira números uno por uno.\nComo caso más favorable encontramos que nuestro código encuentre el mayor número al principio y como caso menos favorable esto sería al revés ");
        System.out.println(" ");
        System.out.println("Cuarto ejercicio");
    }

    private static int highnumber(int[] numbers) {
        int highnum = 0; //Declaramos un número mayor con valor cero ya que iremos tomando nuevos valores.
        for (int o = 0; o < numbers.length; o++){
            if (numbers[o] > highnum){
                //Hacemos que nuestro número mayor tome el valor más grande que aparezca en el array
                highnum = numbers[o];
            }
        }
        return highnum;
    }
    public static void misterioso(int[] array){
        for (int i = 0; i < array.length - 1; i ++){
            int indicemenor = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[indicemenor]){
                    indicemenor = j;
                }
            }
            int temp = array[i];
            array[i] = array[indicemenor];
            array[indicemenor] = temp;
        }
    }
}
