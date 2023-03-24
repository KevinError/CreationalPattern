import builder.Pizza;

public class BuilderMain {
    public static void main(String[] args)
    {
        Pizza pizzaHut = new Pizza.PizzaBuilder(
                "PizzaHut",
                "Small",
                new String[]{"Pepperoni", "Peppers"}
        ).build();
        Pizza pizzaHut2 = new Pizza.PizzaBuilder(
                "PizzaHut",
                "Large",
                new String[]{"Pepperoni", "Peppers", "Ham"}
        ).build();
        Pizza littleCeasars = new Pizza.PizzaBuilder(
                "littleCeasars",
                "Small",
                new String[]{"Pepperoni", "Peppers", "Ham", "Chicken", "Olives", "Pesto"}
        ).build();
        Pizza littleCeasars2 = new Pizza.PizzaBuilder(
                "littleCeasars",
                "Medium",
                new String[]{"Pepperoni", "Peppers", "Ham", "Chicken", "Olives", "Pesto", "Extra Cheese", "Beef"}
        ).build();
        Pizza Dominos = new Pizza.PizzaBuilder(
                "Dominos",
                "Small",
                new String[]{"Pepperoni"}
        ).build();
        Pizza Dominos2 = new Pizza.PizzaBuilder(
                "Dominos",
                "Large",
                new String[]{"Pepperoni", "Peppers", "Ham"}
        ).build();

        System.out.println(pizzaHut.eat());
        System.out.println(pizzaHut2.eat());
        System.out.println(littleCeasars.eat());
        System.out.println(littleCeasars2.eat());
        System.out.println(Dominos.eat());
        System.out.println(Dominos2.eat());
    }
}