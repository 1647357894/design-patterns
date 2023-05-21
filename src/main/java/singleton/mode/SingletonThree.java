package singleton.mode;

/**
 * 静态内部类模式
 * <p>
 * 1.实现简单
 * 2.延迟初始化。调用getInstance才初始化Singleton对象
 * 3.线程安全。JVM在执行类的初始化阶段，会获得一个可以同步多个线程对同一个类的初始化的锁。
 * <p>
 * 如何实现线程安全?
 * 线程A和线程B同时试图获取Singleton对象的初始化锁，假设A获取到了，A进行初始化，B等待，初始化完毕后释放锁，
 * 线程B获取到锁，判断Singleton对象已初始化完毕，释放锁，获取Singleton对象
 *
 * @author wangjie
 * @date 2020/10/4 下午5:47
 */
public class SingletonThree {
    private SingletonThree singleton;

    private SingletonThree() {
    }

    public static SingletonThree getInstance() {
        return Inner.instance;
    }

    private static class Inner {
        public static final SingletonThree instance = new SingletonThree();
    }
}
