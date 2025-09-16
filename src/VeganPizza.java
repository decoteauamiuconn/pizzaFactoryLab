public class VeganPizza implements Pizza {
    
    public VeganPizza() {
        this.PizzaType = PizzaType.vegan;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with vegan cheese and vegetables.");
    }

    public void bake() {
        System.out.println("Baking the" + this.PizzaType + " pizza at 350 degrees for 25 minutes.");
    }

    public void cut() {
        System.out.println("Cutting the" + this.PizzaType + " pizza into slices.");
    }

    public void box() {
        System.out.println("Boxing the" + this.PizzaType + " pizza in official PizzaStore box.");
    }
}