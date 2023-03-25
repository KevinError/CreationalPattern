package factory;

public interface VehicleAbstractFactory {

    public Vehicle createVehicle();
    public String build();
    public String repair();
    public String restore();
}
