import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        System.out.println("");
        UberX uberX= new UberX("AMQ123", new Account ("Cesar Sanchez Martinez", "AND123"), "Chevrolet","Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();


    /*UberVan uberVan = new UberVan("FGH345", new Account("Cesar Sanchez Martinez", "AND123"), new HashMap<>(), new ArrayList<>());
uberVan.setPassenger(5);    
        uberVan.printDataCar();*/
        Car car2= new Car("QWE567", new Account ("Cesar Sanchez Martinez", "ANDA876" ));
        car2.passengers=4;
        car2.printDataCar();
         Car car3= new Car("AMQ123", new Account ("Cesar Sanchez Martinez", "ANDA876" ));
        car3.passengers=4;
        car3.printDataCar();
    }
}
