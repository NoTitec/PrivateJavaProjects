package hf.dp.FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type) {
        //create ny type pizza
        if(type.equals("cheese")) {
            Pizza pizza = new ChicagoStyleCheesePizza();
            return pizza;
        }
        return null;
    }
}
