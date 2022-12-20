package hf.dp.IteratorPattern;

import java.util.Iterator;
public class Waitress {
   Menu pancakeHouseMenu;
   Menu dinerMenu;
    public Waitress(Menu pancakeHouseMenu,Menu dinerMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinerMenu=dinerMenu;
    }
    public void printMenu(){
        Iterator<MenuItem> pancakeIterator= pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator= dinerMenu.createIterator();
        System.out.println("hf.dp.Menu/ Breakfast");
        printMenu(pancakeIterator);
        System.out.println("/ Lunch");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem=iterator.next();
            System.out.println(menuItem.getName());
        }
    }
    public void printVegetarianMenu(){
        Iterator<MenuItem> pancakeIterator= pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator= dinerMenu.createIterator();
        System.out.println("hf.dp.Menu/ Vegetarian Breakfast");
        printVegetarianMenu(pancakeIterator);
        System.out.println("/ Vegetarian Lunch");
        printVegetarianMenu(dinerIterator);
    }
    public void printVegetarianMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem=iterator.next();
            if(menuItem.getVegetarian())
            System.out.println(menuItem.getName());
        }
    }
}
