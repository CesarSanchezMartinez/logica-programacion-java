package je19; //

import java.io.FileOutputStream; //
import java.io.IOException; //
import java.io.OutputStream; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE19 { //
    public static void main(String[] args) { //
        double saldo = 3575.25; //

        try (OutputStream out = new FileOutputStream("saldo.dat")) { //
            // Convertimos el double a una cadena para guardarlo como bytes
            String dato = Double.toString(saldo); //
            out.write(dato.getBytes()); //

            System.out.println("✅ Saldo guardado en archivo."); //
        } catch (IOException e) { //
            System.out.println("❌ Error al guardar archivo: " + e.getMessage()); //
        }
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}