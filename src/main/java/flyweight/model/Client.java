package flyweight.model;

import javax.lang.model.element.VariableElement;

/**
 * 享元模式
 * 运用共享技术有效地支持大量细粒度的对象
 * <p>
 * 优点：
 * 享元模式的外部状态相对独立，使得对象可以在不同环境中被复用
 * 享元模式可共享相同的或相似的细粒度对象，从而减少内存消耗，降低对象创建与垃圾回收的开销。
 * <p>
 * 缺点：
 * 外部状态由客户端保存，共享对象读取外部状态的开销可能比较大
 * 享元模式要求将内部状态与外部状态分离，使得程序的逻辑复杂化，同时增加了状态维护成本。
 *
 * @author wangjie
 * @date 2020/10/5 下午3:52
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight f1 = flyweightFactory.getFlyweight("A");
        f1.operation("21");

        Flyweight f2 = flyweightFactory.getFlyweight("B");
        f2.operation("22");

        Flyweight f3 = new UnsharedConcreteFlyweight("C");
        f3.operation("232");
    }
}
