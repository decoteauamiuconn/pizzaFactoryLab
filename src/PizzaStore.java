//name, address, phone number?
// ^ build shop with these args

// return menu

import java.util.Scanner;

public class PizzaStore {
    

    public static void main(String[] args) { //main method to run program; works similarly to "if __name__ == '__main__':" in Python
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter store name: "); //user input for store name
        String name = scanner.nextLine();

        PizzaStore store = new PizzaStore(name);
        System.out.println(store.getMenu()); //return menu; they now know what options they have


        try {
            PizzaType type = PizzaType.valueOf(pizzaTypeInput);
            store.orderPizza(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, that pizza type is not available.");
        }

        scanner.close();
    }

    public orderPizza(PizzaType type) {   
        Pizza pizza = PizzaFactory.PizzaOrder(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public void getMenu() {
        for (PizzaType type : PizzaType.values()) { //iterates through enum values in PizzaType.java
            String formatted = type.name().substring(0, 1).toUpperCase() + type.name().substring(1) + " Pizza";
            System.out.println(this.name + "serves the following types of pizza:" + formatted);
        }
    }
    


    public void welcome(String name, String address, String phoneNumber) {
        System.out.println("Welcome to " + this.name + " located at " + this.address + ". You can reach us at " + this.phoneNumber + ".");
        getMenu();
    }
}