/**
 * Ejercicios Arrays
 * 
 * Actividad 9
 * Crea un programa que cree un array de enteros de tamaño 100 y luego lo rellene con con valores enteros aleatorios entre 1 y 10
 * (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
 *  
 * @author Ana Castillo Ramírez
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        int [] numeros = new int [100];
        for (int i = 0; i < numeros.length; i++){
            numeros [i] = (int) (Math.random()*10)+1;
            System.out.println(numeros[i]);
        }

        System.out.print("Introduce un valor N: ");
        int n = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
               System.out.println("EL valor N aparece en las posiciones: " + i);
            }
        }   
    }
}
