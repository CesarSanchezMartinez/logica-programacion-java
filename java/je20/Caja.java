package je20; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Caja { //
    // Atributos
    private double ancho; //
    private double alto; //
    private double profundo; //

    // Constructor
    public Caja(double ancho, double alto, double profundo) { //
        this.ancho = ancho; //
        this.alto = alto; //
        this.profundo = profundo; //
    }

    // Método para calcular el volumen
    public double volumen() { //
        return ancho * alto * profundo; //
    }
}
