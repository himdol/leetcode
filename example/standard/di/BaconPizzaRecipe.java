package example.standard.di;

public class BaconPizzaRecipe implements PizzaRecipe{

    public String pizzaName;

    public BaconPizzaRecipe(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public void pizzaDough() {
        System.out.println("make dough Bacon");
    }
}
