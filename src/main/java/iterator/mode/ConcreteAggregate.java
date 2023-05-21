package iterator.mode;

import java.util.ArrayList;
import java.util.List;

/** 具体容器和具体迭代器定义
 * @author wangjie
 * @date 2020/10/4 下午5:13
 */
public class ConcreteAggregate<E> implements Aggregate<E> {
    private Object[] elements;
    private int size;

    public ConcreteAggregate( ) {
        this.elements = new Object[16];
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>();
    }

    @Override
    public void add(E e) {
        elements[size++] = e;
    }


    public int getSize() {
        return size;
    }

    private class ConcreteIterator<E> implements Iterator<E> {
        int cursor;

        @Override
        public E next() {
            if (cursor > size) {
                return null;
            }
            return (E) elements[cursor++];
        }

        @Override
        public boolean hasNext() {
            return cursor != size;
        }
    }

}
