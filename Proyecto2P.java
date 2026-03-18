
package proyecto2p;
import java.util.Scanner;
import java.lang.String;
public class Proyecto2P {
    public static void main(String[] args) {
        String [] articulos={"Afinador","Cleaner","Pua","Plug","Funda","Amplificador","Guitarra","Cuerdas","Audifonos","Adaptador"};
        double [] precios={70,80,10,150,350,1000,800,200,250,25};
        boolean encontrado=false;
        int pos=0;
        Scanner leer=new Scanner (System.in);
        System.out.println("TIENDA GAMA");
        System.out.println("");
        System.out.println("Productos: ");

        for (int i = 0; i < articulos.length; i++) {
            System.out.println(articulos[i] + ": $" + precios[i]);
        }
        String articulosel=null;
             System.out.println("");
        System.out.println("Escriba el articulo que desea comprar");
        Scanner leerart=new Scanner (System.in);
        articulosel = leerart.nextLine();
        for (int x = 0; x < articulos.length; x++) {
            if (articulosel.equalsIgnoreCase(articulos[x])) {
                encontrado = true;
                pos = x;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El producto: " + articulosel + " tiene un precio de: $" + precios[pos]);
        } else {
            System.out.println("Lo sentimos, el producto no fue encontrado");
        }
        if (encontrado){
            System.out.println("¿Que cantidad desea comprar de "+articulosel+"?");
            int cantidad=0;
            double total=0;
            Scanner leercant=new Scanner (System.in);
            cantidad = leercant.nextInt();
            total=precios[pos]*cantidad;
            System.out.println("El precio total es de: "+total);
            }
        boolean añadir=false;

        for (añadir)
            System.out.println("¿Desea añadir mas?");
            Scanner leerañadir=new Scanner (System.in);
            

             

        }

    }
}
  

