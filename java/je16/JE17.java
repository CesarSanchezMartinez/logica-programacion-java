package je16; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE17 { //
    public static void main(String[] args) { //
        String cadena1 = "Hola Mundo"; //
        String cadena2 = "hola mundo"; //
        String cadena3 = "Hola Mundo"; //
        String cadena4 = "Java"; //

        System.out.println("Comparaciones Exactas:"); //
        System.out.println("Cadena1 y Cadena2 (Hola Mundo vs hola mundo): " + ComparadorCadenas.compararExacto(cadena1, cadena2)); //
        System.out.println("Cadena1 y Cadena3 (Hola Mundo vs Hola Mundo): " + ComparadorCadenas.compararExacto(cadena1, cadena3)); //
        System.out.println("Cadena1 y Cadena4 (Hola Mundo vs Java): " + ComparadorCadenas.compararExacto(cadena1, cadena4)); //
        System.out.println("--------------------"); //

        System.out.println("Comparaciones Ignorando Mayúsculas/Minúsculas:"); //
        System.out.println("Cadena1 y Cadena2 (Hola Mundo vs hola mundo): " + ComparadorCadenas.compararIgnorandoMayusculas(cadena1, cadena2)); //
        System.out.println("Cadena1 y Cadena3 (Hola Mundo vs Hola Mundo): " + ComparadorCadenas.compararIgnorandoMayusculas(cadena1, cadena3)); //
        System.out.println("Cadena1 y Cadena4 (Hola Mundo vs Java): " + ComparadorCadenas.compararIgnorandoMayusculas(cadena1, cadena4)); //
        System.out.println("--------------------"); //
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}