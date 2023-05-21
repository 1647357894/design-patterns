package bridge.mode;

/**
 * 实现类接口，定义实现部分的接口，这个接口不用和Abstraction里面的方法一致，通常是由Implementor接口提供基本的操作，
 * 而Abstraction里面定义的是基于这些基本操作的业务方法，也就是说Abstraction定义了基于这些操作的较高层次的操作。
 *
 * @author wangjie
 * @date 2020/10/4 下午9:48
 */
public abstract class Implementor {
    abstract void operation();
}
