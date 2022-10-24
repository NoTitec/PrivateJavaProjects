public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato";
        topping.add("Shredded Mozzarella Chees");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
