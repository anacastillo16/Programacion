/**
 * Ejercicios Arrays
 * 
 * Actividad 14
 * Crea un programa que cree un array de enteros e introduzca 
 * la siguiente secuencia de valores: 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,
 * etc. hasta introducir 10 diez veces, y luego la muestre por 
 * pantalla.
 * 
 * @author Ana Castillo Ramírez.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        int [] secuencia = new int [55];

        int posicion = 0;
        for (int i = 1; i <=10; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[posicion] = i;
                posicion++;
            }
        }
        System.out.println("La secuencia es: ");
        for (int i = 0; i < secuencia.length; i++) {
            System.out.print(secuencia[i] + " ");
        }
        System.out.println();
    }
}