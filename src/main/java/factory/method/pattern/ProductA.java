package factory.method.pattern;

/**
 * 具体产品类A
 *
 * @author wangjie
 * @date 2020/10/6 下午8:52
 */
public class ProductA extends Product {
    @Override
    public void show() {
        System.out.println("产品A");
    }
}
