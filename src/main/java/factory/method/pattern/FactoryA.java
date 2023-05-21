package factory.method.pattern;

/**
 * 具体工厂类
 *
 * @author wangjie
 * @date 2020/10/6 下午8:53
 */
public class FactoryA extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}

