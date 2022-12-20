package hf.dp.CompositePattern;

public class MenuTestDrive {
    public static void main(String args[]) {
        MyHWInfo.printInfo();
// mid-level hf.dp.Menu
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
// adding mid-level Menus to root-level hf.dp.Menu
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        //팬케이크메뉴
        allMenus.add(pancakeHouseMenu);
        //저녁 메뉴
        allMenus.add(dinerMenu);
        //카페 메뉴
        allMenus.add(cafeMenu);
        // 팬케이크 하우스 매뉴
        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));

        // 저녁메뉴
        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));

// 카페폴더에 디저트폴더생성 추가
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        //디저트 추가
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));
        //카페메뉴 추가
        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69));
// 전체메뉴, 채식매뉴 출력
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }

}
