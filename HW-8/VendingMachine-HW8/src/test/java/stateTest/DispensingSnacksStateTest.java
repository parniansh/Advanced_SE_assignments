package stateTest;


import org.example.Snack;
import org.example.VendingMachine;
import org.example.handlers.Coke;
import org.example.handlers.Pepsi;
import org.example.handlers.SnackDispenseHandler;
import org.example.states.DispensingSnacksState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DispensingSnacksStateTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        SnackDispenseHandler handler = new Coke(new Pepsi(null));


        vendingMachine = new VendingMachine(handler);

        vendingMachine.addSnack(new Snack("Coke", 2, 5));
        vendingMachine.addSnack(new Snack("Pepsi", 3, 0));

        vendingMachine.setState(new DispensingSnacksState(vendingMachine));
    }

    @Test
    void dispenseAvailableSnackTest() {

        vendingMachine.setSelectedSnack("Coke");
        vendingMachine.getState().dispenseSnack();

        Snack coke = vendingMachine.getSnacks().stream()
                .filter(snack -> snack.getName().equals("Coke"))
                .findFirst()
                .orElse(null);

        assertEquals(4, coke.getQuantity());
        assertEquals("IdleState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void dispenseOutOfStockSnackTest() {

        vendingMachine.setSelectedSnack("Pepsi");
        vendingMachine.getState().dispenseSnack();

        Snack pepsi = vendingMachine.getSnacks().stream()
                .filter(snack -> snack.getName().equals("Pepsi"))
                .findFirst()
                .orElse(null);

        assertEquals(0, pepsi.getQuantity());
        assertEquals("IdleState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void selectSnackInDispensingSnacksStateTest() {

        vendingMachine.getState().selectSnack();
        assertEquals("DispensingSnacksState", vendingMachine.getState().getClass().getSimpleName());
    }

    @Test
    void insertMoneyInDispensingSnacksStateTest() {

        vendingMachine.getState().insertMoney();
        assertEquals("DispensingSnacksState", vendingMachine.getState().getClass().getSimpleName());
    }
}

