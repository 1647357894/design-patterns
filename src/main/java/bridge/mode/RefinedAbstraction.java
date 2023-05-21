package bridge.mode;

/**
 * 扩充抽象类，扩展抽象部分的接口，通常在这些对象里面，定义跟实际业务相关的方法，这些方法的实现通常会使用
 * Abstraction中定义的方法，也可能需要调用实现部分的对象来完成。
 *
 * @author wangjie
 * @date 2020/10/4 下午9:51
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
