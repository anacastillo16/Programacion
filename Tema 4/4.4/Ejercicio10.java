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

        System.out.print("Introduce las alturas (en metros) de una en una: ");
        int n = Integer.parseInt(System.console().readLine());
        double altura [] = new double [n];

        for (int i = 0; i < altura.length; i++) {
            altura [i] = Double.parseDouble(System.console().readLine());
        }

        double suma = 0, media, max = altura [0], min = altura [0];
        for (int i = 0; i < altura.length; i++){
            suma += altura[i];
            if (altura[i]>max) max = altura [i];
            if (altura[i]<min) min = altura [i];
        }
        media = suma / n;

        
    }
}
