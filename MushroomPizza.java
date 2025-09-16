public class MushroomPizza implements Pizza {
    
    public MushroomPizza() {
        this.PizzaType = pizzaType.mushroom;
    }
    
    private PizzaType PizzaType;

    public void prepare() {
        System.out.println("Preparing a pizza with mushrooms and cheese.");
    }
}