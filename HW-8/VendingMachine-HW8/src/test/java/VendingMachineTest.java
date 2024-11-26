import org.example.Snack;
import org.example.VendingMachine;
import org.example.handlers.Coke;
import org.example.handlers.Pepsi;
import org.example.handlers.SnackDispenseHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.states.WaitingForMoneyState;
import org.example.states.DispensingSnacksState;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class VendingMachineTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {

        SnackDispenseHandler handler = new Coke(new Pepsi(null) {
            @Override
            public void handleRequest(String request) {
                System.out.println("Default handler: Snack not available.");
            }
        });

        vendingMachine = new VendingMachine(handler);
        vendingMachine.addSnack(new Snack("Coke", 2,2));
        vendingMachine.addSnack(new Snack("Pepsi", 1,2 ));
    }

    @Test
    void selectSnackTest() {
        vendingMachine.selectSnack("Coke");

        assertEquals("Coke", vendingMachine.getSelectedSnack());
        assertEquals("WaitingForMoneyState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void insertMoneyTest() {

        vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
        vendingMachine.insertMoney(5);
        assertEquals(5, vendingMachine.getInsertedMoney());
    }

    @Test
    void dispenseSnackTest() {
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2);
        vendingMachine.setState(new DispensingSnacksState(vendingMachine));

        assertDoesNotThrow(() -> vendingMachine.dispenseSnack());
    }

    @Test
    void handleRequestTest() {

        assertDoesNotThrow(() -> vendingMachine.getHandler().handleRequest("Coke"));
        assertDoesNotThrow(() -> vendingMachine.getHandler().handleRequest("Water"));
    }
}
