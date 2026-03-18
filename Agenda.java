
package agenda;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.io.*;
import java.util.*;
   public class Agenda extends JFrame implements ActionListener{
    //Variables de Swing
    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;
    private JTextField camponuevonombre,camponuevotelefono,campobuscarnombre;
    private JLabel etiquetanuevonombre,etiquetanuevotelefono,imprimetelenombre,nombreprograma,nombreautor,numeroversion,dibusca;
    private JButton boton,botonnuevo,botonbusca;
    //Resto de variables
    File archivo = new File("C://pruebas//archivo.txt");
    Formatter nuevoarchivo;
    Scanner x;
    
  
    
    
public Agenda() {
        setLayout(null);
         //Textos de introduccion
        nombreprograma = new JLabel("Agenda telefonica");
        nombreprograma.setBounds(0,0,180,30);
        add(nombreprograma);
        nombreautor = new JLabel("Arturo Gamez - 24597 - 3C");
        nombreautor.setBounds(0,30,180,30);
        add(nombreautor);
        numeroversion = new JLabel("version 1.0");
        numeroversion.setBounds(0,50,180,30);
        add(numeroversion);
        //Menu superior
        
        barra = new JMenuBar();
        setJMenuBar (barra);
        menu1 = new JMenu ("Archivo");
        barra.add(menu1);
        mi1 = new JMenuItem("Nuevo");
        mi1.addActionListener (this);
        menu1.add(mi1);
        mi2 = new JMenuItem ("Buscar");
        mi2.addActionListener (this);
        menu1.add(mi2);
        mi3 = new JMenuItem ("Salir");
        mi3.addActionListener (this);
        menu1.add(mi3);
    

 
    }
 
public void actionPerformed (ActionEvent e) {
    Container f=this.getContentPane();
    if (e.getSource ()==mi1){
   if (e.getSource ()==mi1) {
    nombreprograma.setVisible (false);
    nombreautor.setVisible (false);
    numeroversion.setVisible (false);
    etiquetanuevonombre = new JLabel("Nuevo nombre:");
    etiquetanuevonombre.setBounds(0,0,180,30);
    add(etiquetanuevonombre);
    etiquetanuevonombre.setVisible(true);
    camponuevonombre = new JTextField();
    camponuevonombre.setBounds(200,0,180,30);
    add(camponuevonombre);
    etiquetanuevonombre.setVisible(true);
    etiquetanuevotelefono = new JLabel("Nuevo teléfono:");
    etiquetanuevotelefono.setBounds(0,50,180,30);
    add(etiquetanuevotelefono);
    etiquetanuevotelefono.setVisible(true);
    camponuevotelefono = new JTextField();
    camponuevotelefono.setBounds(200,50,180,30);
    add(camponuevotelefono);
    camponuevotelefono.setVisible(true);
 
    botonnuevo = new JButton ("Crear");
    botonnuevo.setBounds (200,100,180,30);
    add(botonnuevo);
    botonnuevo.addActionListener (this);
    botonnuevo.setVisible (true);
}
        
        
        
        
        
    }
   else if (e.getSource() == mi2) { // <--- AQUÍ está el inicio del bloque para "Buscar"
        nombreprograma.setVisible(false);
        nombreautor.setVisible(false);
        numeroversion.setVisible(false);
 
        imprimetelenombre = new JLabel("Buscar por nombre:");
        imprimetelenombre.setBounds(0, 0, 180, 30);
        add(imprimetelenombre);
        imprimetelenombre.setVisible(true);
 
        campobuscarnombre = new JTextField();
        campobuscarnombre.setBounds(200, 0, 180, 30);
        add(campobuscarnombre);
        campobuscarnombre.setVisible(true);
 
        botonbusca = new JButton("Buscar");
        botonbusca.setBounds(200, 50, 180, 30);
        add(botonbusca);
        botonbusca.addActionListener(this);
        botonbusca.setVisible(true);
    }
    if (e.getSource ()==mi3){
     System.exit(0);
    }
    
    if (e.getSource()==botonnuevo){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","");
            Statement estado = con.createStatement();
            estado.executeUpdate("INSERT INTO agenda VALUES ('2', '"+camponuevonombre.getText()+"','"+camponuevotelefono.getText()+"')");
        }catch(SQLException ex){
            System.out.println("Error de MySQL");
        }catch(ClassNotFoundException err){
            err.printStackTrace();
        }catch(Exception err){
            System.out.println("Se ha encontrado un error inesperado, que es: "+err.getMessage());
        }
    }
}
    
    

 
public static void main(String[] args) {
    Agenda ventana = new Agenda ();
    ventana.setBounds (10,20,450,250);
    ventana.setVisible (true) ;
    System.out.println("Cesar Sanchez Martinez - 24598 - 3C");
}

}
   