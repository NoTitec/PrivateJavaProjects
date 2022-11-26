package hf.dp.Singletonpattern;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        ChocolateBoiler c=ChocolateBoiler.getInstance();
        c.fill();
        c.boil();
        c.drain();
    }
}
