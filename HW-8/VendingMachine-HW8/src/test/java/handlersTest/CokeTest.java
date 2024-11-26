package handlersTest;


import org.example.handlers.Coke;
import org.example.handlers.SnackDispenseHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class CokeTest {



    @Test
    void handleCokeRequestTest() {

        SnackDispenseHandler cokeHandler = new Coke(null);
        assertDoesNotThrow(() -> {
            cokeHandler.handleRequest("Coke");
        });
    }


}
