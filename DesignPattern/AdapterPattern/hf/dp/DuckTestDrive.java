package hf.dp.AdapterPattern.hf.dp;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.time.LocalDate;
import java.time.LocalTime;

public class DuckTestDrive {

    public static void main(String[] args) {
        MyHWInfo.printInfo();

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("                ");
        System.out.println("The Duck says...");
        testDuck(duck);
        System.out.println("                ");
        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
