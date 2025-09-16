public class PepperoniPizza implements Pizza {
    
    public PepperoniPizza() {
        this.PizzaType = pizzaType.pepperoni;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with pepperoni and cheese.");
    }

        public void cut() {
        System.out.println("Cutting the" + this.PizzaType + " pizza into slices.");
    }

    public void box() {
        System.out.println("Boxing the" + this.PizzaType + " pizza in official PizzaStore box.");
    }
}   