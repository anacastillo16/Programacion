/**
 * Ejercicios Arrays
 * 
 * Actividad 13
 * Crea un programa que permita al usuario almacenar una secuencia
 * aritmética en un array y luego mostrarla. Una secuancia aritmética
 * es una serie de números que comienza por un valor inicial v,
 * y continua con incrementos de i. Por ejemplo, con v=1 e i=2,
 * la secuencia sería 1,2,5,7,9... con v=7 e i=10, la secuencia
 * sería 7,17,27,37... El programa solicitará al usuario v,i además
 * de n (nº de valores a crear).
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.print("Introduzca cuantos valores va a crear: ");
        int n = Integer.parseInt(System.console().readLine());
        int[] secuenciaAritmetica = new int[n];

        System.out.print("Introduce un valor inicial: ");
        int v = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el incremento que quieres: ");
        int i = Integer.parseInt(System.console().readLine());
       
        for (int j = 0; j < n; j++) {
            secuenciaAritmetica [j] = v + (j*i);
        }

        System.out.println("La secuencia es: " );
        for (int j = 0; j < n; j++) {
            System.out.print(secuenciaAritmetica[j] + " ");
        }
    }
}
