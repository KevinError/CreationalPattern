package factory;

public class Airplane extends Vehicle{

    private String brandName;
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
