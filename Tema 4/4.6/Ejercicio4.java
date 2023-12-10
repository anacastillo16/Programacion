/**
 * Ejercicios Arrays Bidimensionales
 * 
 * Actividad 4
 * Necesitamos crear un programa para almacenar las notas de 4 
 * alumno (llamados "Alumno 1", "Alumno 2", etc) y 5 asignaturas.
 * El usuario introducirá las notas por teclado y luego el programa
 * mostrará la nota mínima, máxima y la media de cada alumno.
 * 
 * @author Ana Castillo Ramírez
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        float minima=  0;
        float maxima = 0;
        float media = 0;
        float [] [] alumnos = new float [4] [5];

        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[0].length; j ++) {
                System.out.print("Introduce la nota del Alumno " + (i + 1) + " de la asignatura " + (j + 1) + ": ");
            
                alumnos [i] [j] = Integer.parseInt(System.console().readLine());
                media += alumnos[i] [j]; 
                if (j==0) {
                    minima = alumnos [i] [j];
                    maxima = alumnos [i] [j];
                }
                if (minima > alumnos [i] [j]) {
                    minima = alumnos [i] [j];
                }
                if (maxima < alumnos [i] [j]) {
                    maxima = alumnos [i] [j];
                }
            }

            System.out.println("La nota mínima del alumno " + (i + 1) +" es: " + minima);
            System.out.println("La nota máxima del alumno " + (i + 1) +" es: " + maxima);
            System.out.println("La nota media del alumno " + (i + 1) +" es: "+ (media/5));
            media=0;
            System.out.println("");
        }
    }
}
