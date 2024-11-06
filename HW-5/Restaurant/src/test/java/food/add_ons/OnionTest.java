package food.add_ons;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.food.Burger;
import org.example.food.add_ons.Onion;
import org.junit.jupiter.api.Test;

public class OnionTest {

    @Test
    public void priceTest(){
        Burger burger = new Burger();
        Onion onion = new Onion(burger);
        int expectedValue = 7;
        assertEquals(expectedValue, onion.price());
    }
}
