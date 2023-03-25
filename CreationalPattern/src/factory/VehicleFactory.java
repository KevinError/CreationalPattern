package factory;

public class VehicleFactory {

    private static VehicleFactory instance = new VehicleFactory();

    private VehicleFactory(){}

    public static VehicleFactory getInstance(){
        return instance;
    }
    public Factory getFactory(VehicleAbstractFactory factoryMaker) {
        return factoryMaker.createFactory();
    }
}
