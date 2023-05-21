package bridge.mode;

/**
 * 桥接模式
 * 将抽象部分与它实现部分分离，使它们都可以独立地变化
 *
 * @author wangjie
 * @date 2020/10/4 下午7:31
 */
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();


        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();


    }
}
