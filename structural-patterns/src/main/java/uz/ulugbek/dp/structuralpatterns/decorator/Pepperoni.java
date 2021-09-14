package uz.ulugbek.dp.structuralpatterns.decorator;

import java.math.BigDecimal;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/14/2021 1:45 PM
 */
public class Pepperoni extends PizzaIngredient {

    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return (new BigDecimal(1.50).add(this.pizza.getCost()));
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + pepperoni";
    }
}
