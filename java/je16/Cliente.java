package je16; //

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Cliente { //
    private String nombre; //

    // Constructor
    public Cliente(String nombre) { //
        this.nombre = nombre; //
    }

    // Método para obtener el nombre
    public String getNombre() { //
        return nombre; //
    }

    // Método para obtener la longitud del nombre
    public int getLongitudNombre() { //
        return nombre.length(); //
    }

    // Método para verificar si el nombre empieza con un prefijo dado
    public boolean empiezaCon(String prefijo) { //
        return nombre.startsWith(prefijo); //
    }

    // Método para verificar si el nombre contiene una secuencia de caracteres
    public boolean contiene(String secuencia) { //
        return nombre.contains(secuencia); //
    }

    // Método para obtener el nombre en mayúsculas
    public String getNombreMayusculas() { //
        return nombre.toUpperCase(); //
    }
}