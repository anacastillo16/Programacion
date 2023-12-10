/**
 * Ejercicios Arrays Bidimensionales
 * 
 * Actividad 3
 * Crea un programa que cree una matriz de tamaño N*M (introducido
 * por teclado) e introduzca en ella N*M valores (también introducidos
 * por teclado). Luego deberá recorrer la matriz y al final mostrar
 * por pantalla cuántos valores son mayores que 0, cuántos son
 * menores que 0 y cuántos son igual a 0.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int menor = 0;
        int mayor = 0;
        int iguales = 0;

        System.out.print("Introduce el número de filas de la matriz (N): ");
        int tamañoN = Integer.parseInt(System.console().readLine());
        
        System.out.print("Introduce el número de columnas de la matriz (M): ");
        int tamañoM = Integer.parseInt(System.console().readLine());

        int [] [] matriz = new int [tamañoN] [tamañoM];
        
        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduce el valor de la fila: " + (i + 1) + " Columna: " + (j + 1));
                
                matriz [i] [j] = Integer.parseInt(System.console().readLine());

                if (matriz [i] [j] < 0) {
                    menor++;
                } else if (matriz [i] [j] > 0) {
                    mayor++;
                } else {
                    iguales++; 
                }
            }
        }

        System.out.println("Mayores que cero: " + mayor);
        System.out.println("Menores que cero: " + menor);
        System.out.println("Iguales que cero: " + iguales);
    
    }
}
