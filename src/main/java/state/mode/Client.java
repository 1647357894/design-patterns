package state.mode;

/**
 * 状态模式，当一个对象的内在状态改变时允许其行为，这个对象起来像是改变了其类。
 * 将特定状态相关的行为局部化，并且将不同状态的行为分割开来。
 * <p>
 * 使用场景
 * 当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变他行为时，考虑使用状态模式。
 *
 * @author wangjie
 * @date 2020/9/30 下午11:52
 */
public class Client {

    public static void main(String[] args) {
        //设置初始状态为ConcreteStateA
        Context context = new Context(new ConcreteStateA());
        //请求的同时更改状态。
        context.request();
        context.request();
    }

}
