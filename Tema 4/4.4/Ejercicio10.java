/**
 * Ejercicios Arrays
 * 
 * Actividad 10
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas. Pedirá un valor N y luego almacenará
 * en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y media así como cuántas personas miden
 * por encima o por debajo de la media.
 * 
 * @author Ana Castillo Ramírez
*/

public class Ejercicio10 {
    public static void main(String[] args) {

        System.out.print("¿Cuántas alturas va a introducir?: ");
        int n = Integer.parseInt(System.console().readLine());
        double altura [] = new double [n];

        System.out.print("Introduce las alturas de una en una: ");
        System.out.println("Pulse 'enter' después de cada altura.");
        for (int i = 0; i < altura.length; i++) {
            altura [i] = Double.parseDouble(System.console().readLine());
        }

        double suma = 0;
        double media; 
        double max = altura [0];
        double min = altura [0];
        for (int i = 0; i < altura.length; i++){
            suma += altura[i];
            if (altura[i]>max) max = altura [i];
            if (altura[i]<min) min = altura [i];
        }
        media = suma / n;

        int encima = 0; 
        int debajo = 0;
        for (int i = 0; i < altura.length; i++) {
            if (altura[i]>media) encima++;
            if (altura[i]<media) debajo++;
        } 

        System.out.printf("Altura media: %.2f \n" , media);
        System.out.printf("Altura máxima: %.2f\n" , max);
        System.out.printf("Altura mínima: %.2f\n" , min);
        System.out.println("Alturas por encima de la media: " + encima);
        System.out.println("Alturas por debajo de la media: " + debajo);
    }
}