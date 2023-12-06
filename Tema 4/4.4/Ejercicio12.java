/**
 * Ejercicios Arrays
 * 
 * Actividad 12
 * Crea un programa que cree dos arrays de 10 enteros y luego muestre el
 * siguiente menú con distintas opciones:
 * a. Mostrar valores
 * b. Introducir valor
 * c. Salir.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        boolean continuar = true;

        while (continuar) {
            System.out.println("------------MENÚ-------------");
            System.out.println("a) Mostrar valores.");
            System.out.println("b) Introducir valor.");
            System.out.println("c) Salir.");
            System.out.print("Introduce una opción: ");
            String respuesta = System.console().readLine();
            switch (respuesta) {
                case "a":
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();
                    break;
                case "b":
                    System.out.print("Introduce un valor: ");
                    int valor = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduce una posición: ");
                    int posicion = Integer.parseInt(System.console().readLine());
                    if (posicion < 0 || posicion >= numeros.length) {
                        System.out.println("La posición está fuera del límite.");
                    } else {
                        numeros[posicion] = valor;
                    }
                    break;
                case "c":
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("No has introducido una opción correcta.");
                    break;
            }
        }
    }
}
