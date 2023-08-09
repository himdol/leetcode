package example.standard;

import example.standard.di.BaconPizzaRecipe;
import example.standard.di.CheesePizzaRecipe;
import example.standard.di.PizzaChef;

public class PizzaStore {

    public static void main(String[] args) {
        System.out.println("피자 가게입니다..");
        PizzaChef chef1 = new PizzaChef(new CheesePizzaRecipe("Cheese"));
        PizzaChef chef2 = new PizzaChef(new BaconPizzaRecipe("Bacon"));

        chef1.getPizzaRecipe().pizzaDough();
        chef2.getPizzaRecipe().pizzaDough();
    }
}
