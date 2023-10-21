package headfirst.designpattern.factory.pizza;


interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}

class CheesePizza implements Pizza{
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}

class GreekPizza implements Pizza {
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}

class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}


public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        // 피자를 생성하는 부분을 캡슐화
        Pizza pizza = factory.createPizza(type);

        // 아래 부분은 바뀌지 않는다.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}