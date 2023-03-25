package factory;

public class BoatFactoryMaker implements VehicleAbstractFactory{
    String brandName;

    public BoatFactoryMaker(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public Factory createFactory() {
        return new BoatFactory(brandName);
    }
}
