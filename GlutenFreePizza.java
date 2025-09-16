public class GlutenFreePizza implements Pizza {
    
    public GlutenFreePizza() {
        this.PizzaType = PizzaType.glutenFree;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with gluten-free crust and toppings.");
    }
}