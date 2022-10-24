public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        //create ny type pizza
        if(type.equals("cheese")) {
            Pizza pizza = new NYStyleCheesePizza();
            return pizza;
        }
        return null;
    }
}
