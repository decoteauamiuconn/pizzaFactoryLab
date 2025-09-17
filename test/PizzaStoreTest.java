import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaStoreTest {

    @Test
    public void testGetMenu() {
        PizzaStore store = new PizzaStore("Test Store");
        String menu = store.getMenu();
        assertTrue(menu.contains("Cheese Pizza"));
        assertTrue(menu.contains("Greek Pizza"));
    }

    @Test
    public void testOrderPizza() {
        PizzaStore store = new PizzaStore("Test Store 2");
        Pizza pizza = store.orderPizza(PizzaType.cheese);
        assertTrue(pizza instanceof CheesePizza);
    }
}