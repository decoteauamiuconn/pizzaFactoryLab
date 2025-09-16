public class SausagePizza implements Pizza {
    
    public SausagePizza() {
        this.PizzaType = pizzaType.sausage;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with sausage and cheese.");
    }
}

//errors raised when not used, so i'll probably have to translate after all
//^ something bein implemented and not used is inefficidnt, uselessly takes up space