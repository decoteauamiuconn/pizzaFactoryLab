//name, address, phone number?
// ^ build shop with these args

// return menu

public class PizzaStore { 

    private String name;
    private String address;
    private String phoneNumber;

    public static PizzaStore(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static orderPizza(PizzaType type) {   
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