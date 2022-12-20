package hf.dp.IteratorPattern;

public class MenuTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);

        //iterators출력
        System.out.println("All hf.dp.Menu");
        waitress.printMenu();
        System.out.println("Vegetarian hf.dp.Menu");
        waitress.printVegetarianMenu();
    }
}
