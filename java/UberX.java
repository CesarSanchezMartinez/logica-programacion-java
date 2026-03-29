class UberX extends Car {
    String brand;
    String model;

   public UberX (String license, Account driver, String brand, String model){ // Cambiados 'string' y 'string2' a 'brand' y 'model'
    super(license, driver);
    this.brand = brand; // Ahora 'brand' se refiere al parámetro del constructor
    this.model = model; // Ahora 'model' se refiere al parámetro del constructor
}
    

  



    @Override
    void printDataCar(){
        super.printDataCar();
                System.out.println("Modelo: "+ model + " brand: "+ brand);

    }
}

