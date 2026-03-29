import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;
    

    // Constructor corregido
    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver); // La llamada a super() debe ser la primera línea
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    

    @Override
     
public void setPassenger(Integer passenger){
        if(passenger==6){

        
        this.passenger=passenger;

        }else {
            System.out.println("Necesitas asignar cuatro pasajeros");
        }
    }
     
}