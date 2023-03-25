package factory;

public class CarFactoryMaker implements VehicleAbstractFactory{
    String brandName;

    public CarFactoryMaker(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public Factory createFactory() {
        return new CarFactory(brandName);
    }
}
