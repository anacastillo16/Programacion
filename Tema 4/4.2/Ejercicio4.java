/**
 * Ejercicios String
 * 
 * Actividad 4
 * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay 
 * (cuantas 'a',cuantas 'e', etc) en una frase intriducida por teclado. No se debe
 * diferencar entre mayúsculas y minúsculas.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.print("Introduzca una frase: ");
        String frase = System.console().readLine();
        frase = frase.toLowerCase();

        for (int cantidadLetras = 0; cantidadLetras < frase.length(); cantidadLetras ++) { //cuenta la cantidad de letras que hay.
            switch (frase.charAt(cantidadLetras)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("El número de 'a' es: " + a);
        System.out.println("El número de 'e' es: " + e);
        System.out.println("El número de 'i' es: " + i);
        System.out.println("El número de 'o' es: " + o);
        System.out.println("El número de 'u' es: " + u);

    }
}
