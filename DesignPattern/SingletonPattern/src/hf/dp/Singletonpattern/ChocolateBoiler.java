package hf.dp.Singletonpattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty=true;
        boiled=false;
    }
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
            return uniqueInstance;
        }
        return null;
    }

    public void fill(){
        System.out.println("fill");
    }
    public void boil(){
        System.out.println("boil");
    }
    public void drain(){
        System.out.println("drain");
    }
}
