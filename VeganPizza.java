public class VeganPizza implements Pizza {
    
    public VeganPizza() {
        this.PizzaType = pizzaType.vegan;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with vegan cheese and vegetables.");
    }
}