package observer.mode;

public class ConcreteObserverB implements AbstractObserver{
    @Override
    public void update() {
        System.out.println("B同学更新...");
    }
}