package hf.dp.CompositePattern;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    // 다른 모든 메뉴를 포함하고 있는 최상위 메뉴 구성요소 넘겨주기
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // 최상위 메뉴 구성요소 출력하면 트리에 속한 모든 메뉴 출력 가능
    public void printMenu() {
        allMenus.print();
    }
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            // iterator 이용해서 채식주의자 메뉴만 출력
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
            // 여기서 try-catch를 사용한 이유
            // client에서 composite, leaf를 똑같이 취급하고 composite에서 지원하지 않는 메소드임을 나타내기 위해서 사용
        }
    }
}