public class CheesePizza implements Pizza {
    
    public CheesePizza() {
        this.PizzaType = pizzaType.cheese;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with cheese.");
    }
}