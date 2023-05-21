package singleton.mode;

/**
 * 双重检查模式
 * 1.延迟初始化。和懒汉模式一致，只有在初次调用静态方法getInstance，才会初始化singleton实例。
 * 2.性能优化。同步会造成性能下降，在同步创建前通过判断singleton是否初始化，减少不必要的同步开销。
 * 3.线程安全。同步创建Singleton对象，同时注意到静态变量singleton使用volatile修饰。
 * <p>
 * 为什么需要使用volatile修饰?
 * 虽然使用了synchronized进行同步，但在第四步创建对象时，会有下面伪代码
 * 1.分配内存空间
 * 2.初始化对象
 * 3.设置singleton指向刚排序的内存空间
 * 当线程A在执行上面的伪代码时，2和3可能会发生重排序
 * 步骤变为 1 > 3 > 2，线程A执行到第三步时，线程B调用getInstance方法，判断势力不等于空，此时singleton并没有初始化完毕，
 * 线程B访问的将是个还没初始化完毕的对象。
 * 当声明对象的引用为volatile后，伪代码的2、3的重排序将被禁止!
 *
 * @author wangjie
 * @date 2020/10/4 下午5:44
 */
public class SingletonTwo {
    private SingletonTwo() {

    }

    private volatile static SingletonTwo singleton; //1.volatile修饰

    public static SingletonTwo getInstance() {
        //2.减少不必要的同步，优化性能
        if (singleton == null) {
            //3.同步，线程安全
            synchronized (SingletonTwo.class) {
                if (singleton == null) {
                    //创建对象
                    singleton = new SingletonTwo();
                }
            }
        }
        return singleton;
    }

}
