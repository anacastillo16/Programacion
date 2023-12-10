/**
 * Ejercicios Arrays Bidimensionales
 * 
 * Actividad 2
 * Crea un programa que cree una matriz de 10*10 e introduzca
 * los valores de las tablas de multiplicar del 1 al 10 (cada
 * tabla en una fila). Luego mostrará la matriz por pantalla.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int x = 1;
        int[][] numeros = new int[10][10];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = x * (j+1);
                System.out.printf("%4d" , numeros[i][j]);
            }
            x++;
            System.out.println();
        }
    }
}
