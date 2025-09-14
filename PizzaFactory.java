public class PizzaFactory { //class not interface
    public PizzaOrder(PizzaType type) {
        switch (type) { //define types elsewhere
            case CHEESE:
                return new CheesePizza(); 
            
        } 
    }
}
