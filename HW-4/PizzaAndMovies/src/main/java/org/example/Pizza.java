package org.example;

import org.example.Enums.PizzaSize;
import org.example.Enums.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private PizzaSize size;
    private final List<Topping> toppings;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this. size = pizzaBuilder.getSize();
        this.toppings = pizzaBuilder.getToppings();
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }


    public  void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }




    public static class PizzaBuilder implements PizzaBuilderInterface {

        private final PizzaSize size;
        private final List<Topping> toppings= new ArrayList<>();


        public PizzaBuilder(PizzaSize size) {
            this.size = size;
        }

        public PizzaSize getSize() {
            return size;
        }

        public List<Topping> getToppings() {
            return toppings;
        }

        @Override
        public  PizzaBuilder addPepperoni() {
            toppings.add(Topping.Pepperoni);
            return this;
        }

        @Override
        public PizzaBuilder addSausage() {
            toppings.add(Topping.Sausage);
            return this;    }

        @Override
        public PizzaBuilder addMushrooms() {
            toppings.add(Topping.Mushrooms);
            return this;
        }

        @Override
        public PizzaBuilder addBacon() {
            toppings.add(Topping.Bacon);
            return this;
        }

        @Override
        public PizzaBuilder addOnions() {
            toppings.add(Topping.Onions);
            return this;
        }

        @Override
        public PizzaBuilder addExtraCheese() {
            toppings.add(Topping.ExtraCheese);
            return this;
        }

        @Override
        public PizzaBuilder addPeppers() {
            toppings.add(Topping.Peppers);
            return this;
        }

        @Override
        public PizzaBuilder addChicken() {
            toppings.add(Topping.Chicken);
            return this;
        }

        @Override
        public PizzaBuilder addOlives() {
            toppings.add(Topping.Olives);
            return this;
        }

        @Override
        public PizzaBuilder addSpinach() {
            toppings.add(Topping.Spinach);
            return this;
        }

        @Override
        public PizzaBuilder addTomatoBasil() {
            toppings.add(Topping.TomatoBasil);
            return this;
        }

        @Override
        public PizzaBuilder addBeef() {
            toppings.add(Topping.Beef);
            return this;
        }

        @Override
        public PizzaBuilder addHam() {
            toppings.add(Topping.Ham);
            return this;
        }

        @Override
        public PizzaBuilder addPesto() {
            toppings.add(Topping.Pesto);
            return this;
        }

        @Override
        public PizzaBuilder addSpicyPork() {
            toppings.add(Topping.SpicyPork);
            return this;
        }

        @Override
        public PizzaBuilder addHamPineapple() {
            toppings.add(Topping.HamPineapple);
            return this;
        }

        @Override
        public Pizza build() {
            return new Pizza(this);
        }

    }
}
