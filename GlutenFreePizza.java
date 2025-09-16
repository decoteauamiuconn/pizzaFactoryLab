public class GlutenFreePizza implements Pizza {
    
    public GlutenFreePizza() {
        this.PizzaType = glutenFree;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with gluten-free crust and toppings.");
    }

    public void cut() {
        System.out.println("Cutting the" + this.PizzaType + " pizza into slices.");
    }

    public void box() {
        System.out.println("Boxing the" + this.PizzaType + " pizza in official PizzaStore box.");
    }
    
}