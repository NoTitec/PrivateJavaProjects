package hf.dp.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 팬케이크 가게 메뉴 만들고 이터레이터만드는 함수 작성
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu(){
        menuItems=new ArrayList<>();
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs,sausage",false,2.99);
        addItem("Blueberry pancakes","Pancakes mae with fresh blueberries",true,3.49);
    }


    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
