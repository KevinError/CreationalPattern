package factory;

public class Car extends Vehicle{

    private String brandName;


    @Override
    public String build() {
        return this.brandName + "built a car";
    }

    @Override
    public String repair() {
        return this.brandName + "repaired a car";
    }

    @Override
    public String restore() {
        return this.brandName + "restored a car";
    }
}
