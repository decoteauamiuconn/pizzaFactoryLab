import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaFactoryTest {

    @Test
    public void testOrderMushroomPizza() {
        Pizza pizza = PizzaFactory.PizzaOrder(PizzaType.greek);
        assertTrue(pizza instanceof GreekPizza);
    }

    @Test
    public void testOffTheMenu() {
        assertThrows(IllegalArgumentException.class, () -> {
            PizzaFactory.PizzaOrder(null);
        });
    }
}