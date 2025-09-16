public class GreekPizza implements Pizza {
    
    public GreekPizza() {
        this.PizzaType = pizzaType.greek;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with feta cheese and olives.");
    }

    public void bake() {
        System.out.println("Baking the" + this.PizzaType + " pizza in an oiled pan at 400 degrees for 20 minutes.");
    }

    public void cut() {
        System.out.println("Cutting the" + this.PizzaType + " pizza into slices.");
    }

    public void box() {
        System.out.println("Boxing the" + this.PizzaType + " pizza in official PizzaStore box.");
    } //how to callPizzaStore assigned name here?
}   