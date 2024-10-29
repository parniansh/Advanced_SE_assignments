import org.example.Enums.PizzaSize;
import org.example.Enums.Topping;
import org.example.Pizza;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    public  List<Topping> toppings = new ArrayList<>();

    @Test
    public  void addToppingTest(){

        Topping topping = Topping.Pepperoni;

        toppings.add(topping);

        assertTrue(toppings.contains(topping));

    }


    @Nested
    class PizzaBuilderTest {

        @Test
        public void addPepperoniTest(){

            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
            result.addPepperoni();
            assertTrue(result.getToppings().contains(Topping.Pepperoni));
                 }
        @Test
        public void addSausageTest(){

            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
            result.addSausage();
            assertTrue(result.getToppings().contains(Topping.Sausage));
        }
        @Test
        public void addMushroomsTest(){

            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
            result.addMushrooms();
            assertTrue(result.getToppings().contains(Topping.Mushrooms));
        }
        @Test
        public void addBaconTest(){

            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
            result.addBacon();
            assertTrue(result.getToppings().contains(Topping.Bacon));
        }
        @Test
        public void addOnionsTest(){

            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
            result.addOnions();
            assertTrue(result.getToppings().contains(Topping.Onions));
        }
        @Test
        public void addPeppersTest(){

            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
            result.addPeppers();
            assertTrue(result.getToppings().contains(Topping.Peppers));
        }

        @Test
        public  void buildTest(){
            Pizza.PizzaBuilder result = new Pizza.PizzaBuilder(PizzaSize.LARGE);
           org.example.Pizza pizza =  result.build();
           assertNotNull(pizza);

        }
    }

    }
