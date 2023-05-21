package singleton.mode;

/**
 * 饿汉式，即静态初始化方式，类一加载就实例化对象，所以提前占用系统资源。
 *
 * @author wangjie
 * @date 2020/10/4 下午5:42
 */
public class SingletonOne {
    private SingletonOne() {
    }

    private static final SingletonOne singletonOne = new SingletonOne();

    public static SingletonOne getInstance() {
        return singletonOne;
    }
}
