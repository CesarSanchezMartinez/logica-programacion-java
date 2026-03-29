class UberPool extends Car {
    String brand;
    String model;

    public UberPool (String license, Account driver, String brand ){
        super(license, driver);
        this.brand=brand;
        this.model=model;
    }
}
