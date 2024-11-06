import org.example.Loyalty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyTest {

    @Test
    public void applyDiscountTest(){
        double actualValue = Loyalty.applyDiscount(100, "VIP");
        double expectedValue = 75;
        assertEquals(expectedValue,actualValue);
    }
}
