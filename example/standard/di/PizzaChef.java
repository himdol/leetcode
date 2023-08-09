package example.standard.di;

public class PizzaChef {

    private PizzaRecipe pizzaRecipe;


    public PizzaChef(PizzaRecipe pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }

    public PizzaRecipe getPizzaRecipe() {
        return pizzaRecipe;
    }

    public void setPizzaRecipe(PizzaRecipe pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }
    public void getPizzaName() {
        if (pizzaRecipe instanceof CheesePizzaRecipe) {
            System.out.println(((CheesePizzaRecipe) pizzaRecipe).getPizzaName());
        } else if (pizzaRecipe instanceof BaconPizzaRecipe) {
            System.out.println(((BaconPizzaRecipe) pizzaRecipe).getPizzaName());
        }
    }

}
