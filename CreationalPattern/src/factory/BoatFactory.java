package factory;

public class BoatFactory extends Factory{
    private String brandName;

    public BoatFactory(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String build() {
        return brandName + " built a boat";
    }

    @Override
    public String repair() {
        return brandName + " repaired a boat";
    }

    @Override
    public String restore() {
        return brandName + " restored a boat";
    }
}
