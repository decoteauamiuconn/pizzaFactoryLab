//name, address, phone number?
// ^ build shop with these args

// return menu

public class PizzaStore { 

    private String name;
    private String address;
    private String phoneNumber;

    public PizzaStore(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public orderPizza(PizzaType type) {   
        Pizza pizza = PizzaFactory.PizzaOrder(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }; //compare to each Pizzatype: ensure compatibility

    public void getMenu() {
    for (PizzaType type : PizzaType.values()) {
    String formatted = type.name().substring(0, 1).toUpperCase() + type.name().substring(1) + " Pizza";
    System.out.println(this.name + "serves the following types of pizza:" + formatted);
}
    }
    


    public void welcome(String name, String address, String phoneNumber) {
        System.out.println("Welcome to " + this.name + " located at " + this.address + ". You can reach us at " + this.phoneNumber + ".");
        getMenu();
    }
}