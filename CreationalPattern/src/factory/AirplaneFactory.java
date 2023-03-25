package factory;

public class AirplaneFactory implements VehicleAbstractFactory{
    private String brandName;

    public AirplaneFactory(String brandName){
        this.brandName = brandName;
    }
    @Override
    public Vehicle createVehicle() {
        return new Airplane(brandName);
    }

    @Override
    public String build() {
        return this.brandName + "built an airplane";
    }

    @Override
    public String repair() {
        return this.brandName + "repaired an airplane";
    }

    @Override
    public String restore() {
        return this.brandName + "restored an airplane";
    }
}
