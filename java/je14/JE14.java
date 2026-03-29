package je14; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class JE14 { //
    public static void main(String[] args) { //
        // Declaración e inicialización de una matriz 2D (3 filas, 4 columnas)
        // Representa 3 cuentas y 4 movimientos para cada una
        double[][] movimientos = { //
            {100.0, -50.0, 200.0, -75.0}, // Movimientos para la cuenta 1
            {500.0, -150.0, -25.0, 100.0}, // Movimientos para la cuenta 2
            {1000.0, -200.0, 300.0, -50.0} // Movimientos para la cuenta 3
        }; //

        // Iterar a través de las filas (cuentas)
        for (int i = 0; i < movimientos.length; i++) { //
            System.out.println("Movimientos de la cuenta " + (i + 1) + ":"); //
            // Iterar a través de las columnas (movimientos para cada cuenta)
            for (int j = 0; j < movimientos[i].length; j++) { //
                System.out.println("  Movimiento " + (j + 1) + ": $" + movimientos[i][j]); //
            }
            System.out.println("--------------------"); //
        }
        System.out.println("Cesar Sanchez Martinez - 24598 - 3C"); // Código añadido
    }
}