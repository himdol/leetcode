package example.standard.di;

public class CheesePizzaRecipe implements PizzaRecipe {

    private final String pizzaName;

    public CheesePizzaRecipe(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public void pizzaDough() {
        System.out.println("make dough Cheese");
    }

    public String getPizzaName() {
        return pizzaName;
    }
}
