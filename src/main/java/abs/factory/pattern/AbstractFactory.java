package abs.factory.pattern;

/**
 * 抽象工厂接口，包含了所有产品创建的抽象方法
 *
 * @author wangjie
 * @date 2020/9/29 下午10:18
 */
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductb();
}
