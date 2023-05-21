package observer.mode;

import template.method.pattern.AbstractClass;

/**
 * 抽象主题角色
 * 把所有观察者对象的引用保存在一个集合中，每个抽象主题角色都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者角色
 *
 * @author wangjie
 * @date 2020/10/8 下午3:26
 */
public interface AbstractSubject {
    void addObserver(AbstractObserver observer);

    void removeObserver(AbstractObserver observer);

    void notification();
}
