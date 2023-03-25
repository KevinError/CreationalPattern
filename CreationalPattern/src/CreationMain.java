import factory.*;
public class CreationMain {

    public static void main(String[] args){
        VehicleFactory instance = VehicleFactory.getInstance();

        Vehicle car = instance.getVehicle(new CarFactory("Tesla"));
        Vehicle car2 = instance.getVehicle(new CarFactory("Honda"));
        Vehicle car3 = instance.getVehicle(new CarFactory("Porsche"));
        Vehicle airplane = instance.getVehicle(new AirplaneFactory("Airbus"));
        Vehicle airplane2 = instance.getVehicle(new AirplaneFactory("Boeing"));
        Vehicle airplane3 = instance.getVehicle(new AirplaneFactory("Embraer"));

    }
}
