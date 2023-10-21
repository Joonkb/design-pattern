package headfirst.designpattern.factory.pizza;

public class SimplePizzaFactory {
    public  Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza =  new CheesePizza();
        } else if (type.equals("greek")) {
            pizza =  new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new PepperoniPizza();   // 피자 종류의 추가
        }
        return pizza;
    }
}
