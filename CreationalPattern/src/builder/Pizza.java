package builder;

public class Pizza {

    private String brandName;
    private String size;
    private String[] toppings;

    private Pizza(PizzaBuilder builder) {
        this.brandName = builder.brandName;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public String getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public String eat(){
        String topping = "";
        for (String top:this.toppings){
            topping += top + ", ";
        }
        return "Pizza Chain: " + this.brandName + ", size: " + this.size + ", toppings: " + topping;
    }

    public static class PizzaBuilder{
        private String brandName;
        private String size;
        private String[] toppings;

        public PizzaBuilder(String brandName, String size, String[] toppings) {
            this.brandName = brandName;
            this.size = size;
            this.toppings = toppings;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }


}
