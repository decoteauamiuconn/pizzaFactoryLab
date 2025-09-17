import org.junit.Test;
import static org.junit.Assert.assertTrue; //repeatedly added when sking copilot for help debugging
import static org.junit.Assert.fail;

public class PizzaFactoryTest {

    @Test
    public void testOrderMushroomPizza() {
        Pizza pizza = PizzaFactory.PizzaOrder(PizzaType.mushroom);
        assertTrue(pizza instanceof MushroomPizza);
    }

    @Test
    public void testOffTheMenu() {
        try {
            PizzaFactory.PizzaOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }
}
