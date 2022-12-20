package hf.dp.IteratorPattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS=6;int numberOfItems=0;
    MenuItem[] menuItems;
    public DinerMenu(){
        menuItems=new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","Bacon with Lettuce&tomato on whole wheat",true,2.99);
        addItem("Soup of the Day","Soup of the Day with potato salad",false,2.99);
    }

    public void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry menu is full! Can't add any more items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems+=1;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
