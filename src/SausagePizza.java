public class SausagePizza implements Pizza {
    
    public SausagePizza() {
        this.PizzaType = PizzaType.sausage;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with sausage and cheese.");
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

//errors raised when not used, so i'll probably have to translate after all
//^ something bein implemented and not used is inefficidnt, uselessly takes up space