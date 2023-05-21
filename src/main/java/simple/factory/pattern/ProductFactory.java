package simple.factory.pattern;

/**
 * 简单工厂类
 *
 * @author wangjie
 * @date 2020/10/6 下午8:39
 */
public class ProductFactory {
    /**
     * 静态工厂方法
     * 根据传进来的参数，来决定创建产品
     *
     * @param productType
     * @return
     */
    public static Product createProduct(String productType) {
        Product product = null;
        if ("A".equals(productType)) {
            System.out.println("创建A产品");
            product = new ConcreteProductA();
        } else if ("B".equals(productType)) {
            System.out.println("创建B产品");
            product = new ConcreteProductB();
        }
        return product;
    }
}
