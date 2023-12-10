/**
 * Ejercicios Arrays Bidimensionales
 * 
 * Actividad 5
 * Necesitamos crear un programa para registrar sueldos de hombres
 * y mujeres de una empresa y detectar si existe una brecha salarial
 * entre ambos. El programa pedirá por teclado la información de
 * N personas distintas (valor introducido por teclado). Para
 * cada persona, pedirá su género (0 para varón y 1 para mujer)
 * y su sueldo. Esta información deb guardarse en una única matriz.
 * Luego se mostrará por pantalla el sueldo medio de cada género.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        int nvarones = 0;
        int nmujeres = 0;
        int sumavarones = 0;
        int sumamujeres = 0;
        System.out.print("Introduce el número de personas del que va a calcular la media: ");
        int personas = Integer.parseInt(System.console().readLine());

        int[][] brecha = new int[personas][2];
        for (int i = 0; i < brecha.length; i++) {
            for (int j = 0; j < brecha[0].length; j++) {
                if (j == 0) {
                    System.out.print("Introduce el género (0 - varón, 1 - mujer) de la persona " + (i + 1) + ": ");
                    brecha[i][j] = Integer.parseInt(System.console().readLine());

                }
                if (j == 1) {
                    System.out.print("Introduzca su sueldo: ");
                    brecha[i][j] = Integer.parseInt(System.console().readLine());
                }
            }
        }

        for (int i = 0; i < brecha.length; i++) {
            for (int j = 0; j < brecha[0].length; j++) {
                System.out.print(brecha[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < brecha.length; i++) {
            if (brecha[i][0] == 0) {
                nvarones++;
                sumavarones += brecha[i][1];
            }
            if (brecha[i][0] == 1) {
                nmujeres++;
                sumamujeres += brecha[i][1];
            }
        }
        System.out.println("El sueldo medio de los varones es: " + (sumavarones / nvarones));
        System.out.println("El sueldo medio de las mujeres es: " + (sumamujeres / nmujeres));

    }
}
