import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList topping= new ArrayList<>();

    void prepare(){
        System.out.println("Preparing"+name);
        System.out.println("toss");
        System.out.println("add sauce");
        System.out.println("add toppings");
        for(int i=0;i<topping.size();i++){
            System.out.println("-"+topping.get(i));
        }


    }

    void bake(){
        System.out.println("bake");
    }
    void cut(){
        System.out.println("cut");
    }
    void box(){
        System.out.println("place");
    }
}
