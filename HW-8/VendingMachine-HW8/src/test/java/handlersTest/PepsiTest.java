package handlersTest;

import org.example.handlers.Coke;
import org.example.handlers.Pepsi;
import org.example.handlers.SnackDispenseHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PepsiTest {

    @Test
    void handleCokeRequestTest() {

        SnackDispenseHandler PepsiHandler = new Coke(new Pepsi(null));
        assertDoesNotThrow(() -> {
            PepsiHandler.handleRequest("Pepsi");
        });
    }
}
