package factory;

public class AirplaneFactory extends Factory{
    private String brandName;

    public AirplaneFactory(String brandName){
        this.brandName = brandName;
    }

    @Override
    public String build() {
        return this.brandName + " built an airplane";
    }

    @Override
    public String repair() {
        return this.brandName + " repaired an airplane";
    }

    @Override
    public String restore() {
        return this.brandName + " restored an airplane";
    }
}
