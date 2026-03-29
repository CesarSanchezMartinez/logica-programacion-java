package je20;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE20 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Caja
        Caja miCaja = new Caja(10.0, 5.0, 3.0); // Ancho, alto, profundo

        // Calcular el volumen de la caja
        double volumen = miCaja.volumen();

        // Mostrar el resultado
        System.out.println("El volumen de la caja es: " + volumen);
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
    }
}