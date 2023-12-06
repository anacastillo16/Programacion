/**
 * Ejercicios Arrays
 * 
 * Actividad 11
 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos 
 * los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al segundo array
 * en orden inverso, y mostrar ambos por pantalla.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        int [] numeros1 = new int [100];
        int [] numeros2 = new int [100];

        //hago que la variable numeros1 vaya del número 1 hasta el 100
        for (int i = 0; i < 100; i++) {
            numeros1[i] = i + 1;
        }

        //hago que la variable numeros2 vaya del número 100 hasta el 1
        for (int i = 0; i < 100; i++) {
            numeros2[i] = numeros1[100 - i - 1];
        }

        //muestro los resultados
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros1[i] + " ") ;    
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(numeros2[i] + " ");    
        }
        System.out.println();

        
    }
}