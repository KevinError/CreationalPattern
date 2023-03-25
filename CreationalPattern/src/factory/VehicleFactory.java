package factory;

public class VehicleFactory {

    private static VehicleFactory instance = new VehicleFactory();

    private VehicleFactory(){}

    public static VehicleFactory getInstance(){
        return instance;
    }
    public Vehicle getVehicle(VehicleAbstractFactory vehicle) {
        return vehicle.createVehicle();
    }
}
