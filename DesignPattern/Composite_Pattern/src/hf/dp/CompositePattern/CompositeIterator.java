package hf.dp.CompositePattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    //composite인 경우 하위 메서드를 호출하여 반복
    // 하지만 해당 코드에서는 iterator를 사용하므로 외부에서 반복자 사용 -> 스택 사용해야 함
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    // 최상위 composite의 iterator 전달
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            //component 파일이면 createIterator 는 null 이고 폴더면 새로운 이터레이터
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

	/*
	 * No longer needed as of Java 8
	 *
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}