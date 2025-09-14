public class PizzaFactory { //class not interface
    public PizzaOrder(PizzaType type) {
        switch (type) { //define types elsewhere <- defined in PizzaType.java at 6:52 PM
            case cheese:
                return new CheesePizza(); 
            case greek:
                return new GreekPizza();
            case pepperoni:
                return new PepperoniPizza();
            case vegan:
                return new VeganPizza();
            case mushroom:
                return new MushroomPizza();
            case sausage:  
                return new SausagePizza();
            case glutenFree:
                return new GlutenFreePizza();
            default:
                throw new IllegalArgumentException(type + " is not on the menu.");
                //IllegalArgumentException was autosuggested by the IDE
        } 
    }
}
