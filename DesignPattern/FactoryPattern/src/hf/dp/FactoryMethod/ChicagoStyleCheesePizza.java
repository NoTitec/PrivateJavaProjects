package hf.dp.FactoryMethod;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago Style FactoryMethod.Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";
        topping.add("Shredded Mozzarella Chees");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
