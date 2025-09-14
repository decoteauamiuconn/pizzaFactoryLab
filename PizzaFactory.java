public class PizzaFactory { //class not interface
    public PizzaOrder(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new CheesePizza(); 
            
        } 
    }
}
