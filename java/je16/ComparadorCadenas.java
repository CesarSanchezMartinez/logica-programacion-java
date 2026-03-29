package je16; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class ComparadorCadenas { //

    // Método para comparar dos cadenas de forma exacta (sensible a mayúsculas/minúsculas)
    public static boolean compararExacto(String cadena1, String cadena2) { //
        return cadena1.equals(cadena2); //
    }

    // Método para comparar dos cadenas ignorando mayúsculas y minúsculas
    public static boolean compararIgnorandoMayusculas(String cadena1, String cadena2) { //
        return cadena1.equalsIgnoreCase(cadena2); //
    }
}