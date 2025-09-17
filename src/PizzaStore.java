//name, address, phone number?
// ^ build shop with these args

// return menu

import java.util.Scanner;

public class PizzaStore {
    private String name;

    public PizzaStore(String name) {
        this.name = name;
    }
    
    // which one of these ^ v goes first

    public static void main(String[] args) { //main method to run program; works similarly to "if __name__ == '__main__':" in Python
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter store name: "); //user input for store name
        String name = scanner.nextLine();

        PizzaStore store = new PizzaStore(name);
        store.getMenu(); //return menu; they now know what options they have

        System.out.print("Enter pizza type: "); //prompt user for pizza type
        String pizzaTypeInput = scanner.nextLine().toLowerCase();

        try {
            PizzaType type = PizzaType.valueOf(pizzaTypeInput);
            store.orderPizza(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, that pizza type is not available.");
        }

        scanner.close();
    }

    public void orderPizza(PizzaType type) {   //was previously implemented elsewhere and not here
        Pizza pizza = PizzaFactory.PizzaOrder(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public String getMenu() {
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append(this.name).append(" serves the following types of pizza:\n");
        for (PizzaType type : PizzaType.values()) { //iterates through enum values in PizzaType.java
            String formatted = type.name().substring(0, 1).toUpperCase() + type.name().substring(1) + " Pizza";
            menuBuilder.append(formatted).append("\n");
        }
        String menu = menuBuilder.toString();
        System.out.print(menu);
        return menu;
    }
    


    //left in an outdated function
}