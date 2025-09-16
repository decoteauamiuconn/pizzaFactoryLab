public class PepperoniPizza implements Pizza {
    
    public PepperoniPizza() {
        this.PizzaType = pizzaType.pepperoni;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with pepperoni and cheese.");
    }
}   