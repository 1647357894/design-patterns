package observer.mode;

/**
 * 抽象观察者
 * 为所有具体的观察者定义一个接口，在得到主题的通知时更新自己。
 *
 * @author wangjie
 * @date 2020/10/8 下午3:28
 */
public interface AbstractObserver {
    void update();
}
