package factory;

public class CarFactory implements VehicleAbstractFactory{
    private String brandName;

    public CarFactory(String brandName){
        this.brandName = brandName;
    }
    @Override
    public Vehicle createVehicle() {
        return new Car(brandName);
    }

    @Override
    public String build() {
        return this.brandName + "built a car";
    }

    @Override
    public String repair() {
        return this.brandName + "repaired a car";
    }

    @Override
    public String restore() {
        return this.brandName + "restored a car";
    }
}
