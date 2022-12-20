package hf.dp.TemplatePattern.hf.dp;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.time.LocalDate;
import java.time.LocalTime;

public class BeverageTestDrive {



    public static void main(String[] args) {
        MyHWInfo.printInfo();



        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
