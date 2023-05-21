package observer.mode;

/**
 * 观察者模式
 * 定义了一对多的的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态上发生变化时，会通知所有的观察者对象，让他们能够自动更新自己。
 *
 * @author wangjie
 * @date 2020/10/8 下午3:20
 */
public class Client {
    public static void main(String[] args) {
        AbstractSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.addObserver(new ConcreteObserverB());

        subject.notification();
    }
}
