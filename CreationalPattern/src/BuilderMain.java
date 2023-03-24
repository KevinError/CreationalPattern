import builder.Pizza;

public class BuilderMain {
    public static void main(String[] args)
    {
        Pizza pizzaHut = new Pizza.PizzaBuilder(
                "PizzaHut",
                "Small",
                new String[]{"Pepperoni", "Peppers", "Ham"}
        ).build();
        Pizza pizzaHut2 = new Pizza.PizzaBuilder(
                "PizzaHut",
                "Medium",
                new String[]{"Pepperoni", "Peppers", "Ham", "Chicken", "Olives", "Pesto"}
        ).build();
        Pizza pizzaHut3 = new Pizza.PizzaBuilder(
                "PizzaHut",
                "Large",
                new String[]{"Pepperoni", "Peppers", "Ham", "Chicken", "Olives", "Pesto", "Extra Cheese", "Beef", "Onions"}
        ).build();
        System.out.println(pizzaHut.eat());
        System.out.println(pizzaHut2.eat());
        System.out.println(pizzaHut3.eat());
    }
}