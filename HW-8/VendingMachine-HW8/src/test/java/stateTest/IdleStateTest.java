package stateTest;


import org.example.VendingMachine;
import org.example.Snack;
import org.example.handlers.SnackDispenseHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.states.IdleState;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdleStateTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        SnackDispenseHandler handler = new SnackDispenseHandler(null) {
            @Override
            public void handleRequest(String request) {
                System.out.println("Default handler: Snack not available.");
            }
        };

        vendingMachine = new VendingMachine(handler);
        vendingMachine.addSnack(new Snack("Coke", 2,2)); // Add a snack
    }

    @Test
    void selectSnackTest() {

        vendingMachine.setState(new IdleState(vendingMachine));
        vendingMachine.selectSnack("Coke");


        assertEquals("Coke", vendingMachine.getSelectedSnack());
        assertEquals("WaitingForMoneyState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void insertMoneyInIdleStateTest() {

        vendingMachine.setState(new IdleState(vendingMachine));
        vendingMachine.insertMoney(5);

        assertEquals("IdleState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void dispenseSnackInIdleStateTest() {

        vendingMachine.setState(new IdleState(vendingMachine));
        vendingMachine.dispenseSnack();

        assertEquals("IdleState", vendingMachine.getState().getClass().getSimpleName());
    }
}