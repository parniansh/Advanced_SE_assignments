import org.example.Enums.Chain;
import org.example.PizzaChain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaChainTest {


    @Test
    public void eatTest(){

        Chain chainName = Chain.PIZZAHUT;
        PizzaChain pizzaChain = new PizzaChain(chainName);

        StringBuilder sb = new StringBuilder();
        sb.append("Chain Name: ").append(pizzaChain.getName()).append("\n");
        sb.append("Pizzas:").append("\n");
        String result = sb.toString();

        String expected = "Chain Name: PIZZAHUT\nPizzas:\n";
        assertEquals(expected, result);
    }

}
