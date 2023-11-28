/**
 * Ejercicios String
 * 
 * Actividad 3
 * Crea un programa que pida por teclado tres cadenas de texo: nombre y dos apellidos.
 * Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres 
 * primeras letras de cada uno de ellos.
 * 
 * @author Ana Castillo Ramírez
 *  */

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduzca su nombre: ");
        String nombre = System.console().readLine();
        System.out.print("Introduzca su primer apellido: ");
        String apellido1 = System.console().readLine();
        System.out.print("Introduzca su segundo apellido: ");
        String apellido2 = System.console().readLine();

        //concatena las 3 primeras letras de lo que ha introducido el usuario.
        String codigoUsuario = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);
        System.out.println("Tu código de usuario es: " + codigoUsuario.toUpperCase() /*lo muestra en mayúscula */);
    }
}
