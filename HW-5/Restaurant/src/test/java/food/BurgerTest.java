package food;
import org.example.food.Burger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BurgerTest {

   @Test
    public void priceTest(){
       Burger burger = new Burger();
       int expectedPrice = 6;
        assertEquals(burger.price(), expectedPrice);
    }
}
