package observer.mode;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色
 * 在具体主题内部状态改变时，给所有登记过的观察者发出通知，具体主题角色通常是一个子类实现
 *
 * @author wangjie
 * @date 2020/10/8 下午3:27
 */
public class ConcreteSubject implements AbstractSubject {
    private List<AbstractObserver> list = new ArrayList<>();

    @Override
    public void addObserver(AbstractObserver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(AbstractObserver observer) {
        list.remove(observer);
    }

    /**
     * 状态改变了，所有观察者更新自己的界面
     */
    @Override
    public void notification() {
        for (AbstractObserver observer : list) {
            observer.update();
        }
    }
}
