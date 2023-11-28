/**
 * Ejercicios String
 * 
 * Actividad 2
 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si 
 * si son iguales, además de si son iguales sin diferenciar entre mayúsculas o 
 * minúsculas.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase1 = System.console().readLine();
        System.out.print("Introduce otra frase: ");
        String frase2 = System.console().readLine();

        if (frase1.equalsIgnoreCase(frase2)) { //compara las dos frases, ignorando mayúsculas y minúsculas
            System.out.println("Las frase son iguales.");
        } else {
            System.out.println("Las frases no son iguales.");
        }
    }
}
