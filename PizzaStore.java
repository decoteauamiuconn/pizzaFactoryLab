//name, address, phone number?
// ^ build shop with these args

// return menu

public class PizzaStore { 
    public void orderPizza(PizzaType type) {   
        Pizza pizza = PizzaFactory.PizzaOrder(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }; //compare to each Pizzatype: ensure compatibility
    public String getMenu() {
        //return menu as a string. maybe run TranslatePizzaTypes and return?
    }; 
}