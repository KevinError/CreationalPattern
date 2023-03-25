package factory;

public class AirplaneFactoryMaker implements VehicleAbstractFactory{
    private String brandName;

    public AirplaneFactoryMaker(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public Factory createFactory() {
        return new AirplaneFactory(brandName);
    }
}
