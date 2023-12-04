/**
 * Ejercicios Arrays
 * 
 * Actividad 8
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando
 * Math.random(), y que luego le pida al usuario un valor real R. Por último, mostrará cuántos valores del 
 * array son igual o superiores a R.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        double [] numeros = new double [100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
            System.out.println(numeros[i]);
        }

        System.out.print("Introduce un número real de 0.0 a 1.0: ");
        double r = Double.parseDouble(System.console().readLine());

        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= r) {
                j ++;
            }
        }

        System.out.println("Cantidad de números mayores o iguales: " + j);
    }  
}
