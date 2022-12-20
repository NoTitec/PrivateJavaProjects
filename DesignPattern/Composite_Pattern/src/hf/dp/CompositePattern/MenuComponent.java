package hf.dp.CompositePattern;

import java.util.Iterator;

public abstract class MenuComponent {
    // 메소드들은 하위 클래스에서 구현하지 않을 경우 기본적으로 오류 던지도록 구현

    // hf.dp.MenuComponent 관련 메소드
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // hf.dp.MenuItem 관련 메소드
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
    public abstract Iterator<MenuComponent> createIterator();
}