package stateTest;

import org.example.Snack;
import org.example.VendingMachine;
import org.example.handlers.Coke;
import org.example.handlers.SnackDispenseHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitingForMoneyStateTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        SnackDispenseHandler handler = new Coke(null);

        vendingMachine = new VendingMachine(handler);
        vendingMachine.addSnack(new Snack("Coke", 2,2));
    }

    @Test
    void insertEnoughMoneyTest() {

        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2);
        assertEquals("IdleState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void insertNotEnoughMoneyTest() {

        vendingMachine.setSelectedSnack("Chips");
        vendingMachine.insertMoney(1);
        vendingMachine.getState().insertMoney();
        assertEquals("IdleState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void selectSnackInWaitingForMoneyStateTest() {

        vendingMachine.setSelectedSnack("Coke");
        vendingMachine.getState().selectSnack();
        assertEquals("WaitingForMoneyState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void testDispenseSnackInWaitingForMoneyState() {

        vendingMachine.selectSnack("Coke");
        vendingMachine.getState().dispenseSnack();
        assertEquals("WaitingForMoneyState", vendingMachine.getState().getClass().getSimpleName());
    }

}
