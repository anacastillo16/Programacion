/**
 * Ejercicios String
 * 
 * Actividad 5
 * Programa que lea una frase por teclado e indique si la frase es un palíndro, o no
 * (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos
 * que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.) 
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean palindromo = true;
        System.out.print("Introduce una frase: ");
        String frase = System.console().readLine();
       
        frase = frase.toUpperCase(); //pasamos la frase a mayúscula.
        int longitud = frase.length(); //definimos la longitud de la frase.

        for (int i = 0; i < longitud && palindromo; i ++) { //comprueba que la palabra sea igual al derecho que al revés.
            if (frase.charAt(i) != frase.charAt((longitud - 1) - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La frase es palindromo.");
        } else {
            System.out.println("La frase no es palindromo.");
        }
    }
}
