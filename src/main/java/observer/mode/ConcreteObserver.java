package observer.mode;

/**
 * 具体观察者
 * 该角色实现抽象观察者所要求的更新接口，以便使本身的状态与主题的状态相协调，
 *
 * 如果需要，具体的观察者角色可以有一个指向具体主题的角色引用
 *
 * @author wangjie
 * @date 2020/10/8 下午3:29
 */
public class ConcreteObserver implements AbstractObserver {
    @Override
    public void update() {
        System.out.println("A同学更新...");
    }
}


