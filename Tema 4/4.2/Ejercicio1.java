/**
 * Ejercicios String
 * 
 * Actividad 1
 * Crea un programa que pida una cadena de texto por teclado y luego muestre cada
 * palabra de la cadena en una línea distinta.
 * 
 * @author Ana Castillo Ramírez
 * 
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Escribe una frase: ");
        String frase = System.console().readLine();

        String [] frase_dividida = frase.split(" ");

        System.out.println("La frase dividida es: ");

        for (int i = 0; i < frase_dividida.length; i ++) { //esto es para que devuelva cada palabra en una línea
            System.out.println(frase_dividida[i]);
        }
    }
}
