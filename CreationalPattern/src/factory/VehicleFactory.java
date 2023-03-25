package factory;

public class VehicleFactory {


    public static Vehicle getVehicle(VehicleAbstractFactory vehicle) {
        return vehicle.createVehicle();
    }
}
