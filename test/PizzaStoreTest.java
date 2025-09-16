import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        // You may need to adjust this if orderPizza returns void
        // Instead, test the side effects or refactor to return Pizza
        // For example:
        // Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        // assertEquals("Cheese Pizza", pizza.getType().toStringValue());
    }
}