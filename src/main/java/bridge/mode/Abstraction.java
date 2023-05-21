package bridge.mode;

/**
 * 抽象类，抽象部分的接口。通常在这个对象里面，要维护一个实现部分的对象引用，在抽象对象里面的方法，需要调用实现部分的对象来完成。
 * 这个对象里面的方法，通常都是跟具体的业务相关的方法。
 *
 * @author wangjie
 * @date 2020/10/4 下午9:50
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
