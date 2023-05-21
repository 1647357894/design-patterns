package abs.factory.pattern;

/**
 * 具体的工厂，创建具有特定实现的产品
 *
 * @author wangjie
 * @date 2020/9/29 下午10:25
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductb() {
        return new ProductB2();
    }
}
