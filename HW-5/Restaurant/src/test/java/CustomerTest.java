import food.BurgerTest;
import org.example.Customer;
import org.example.food.Burger;
import org.example.food.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {

    @Test
    public void addToOrderTest(){
        Customer customer = new Customer("Parnian");
        Burger burger = new Burger();
        customer.addToOrder(burger);
        assertNotNull(customer.order);
    }

    @Test
    public void CalculateOrderPriceTest(){
        Customer customer = new Customer("Parnian");
        Burger burger = new Burger();
        HotDog hotDog = new HotDog();
        customer.addToOrder(burger);
        customer.addToOrder(hotDog);
        int expectedValue = 11;
        assertEquals(expectedValue,customer.CalculateOrderPrice());
    }
}
