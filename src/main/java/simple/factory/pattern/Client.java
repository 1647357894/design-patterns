package simple.factory.pattern;

/**
 * 简单工厂模式
 * 属于创建型模式，又叫静态工厂方法模式，不属于GOF设计模式。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂实质是由一个工厂类根据传入的参数，动态的决定应该创建哪一个产品类的实例。
 * <p>
 * 优点： 负责所有产品的创建逻辑
 * 缺点： 引入新产品时，需要修改工厂类的产品创建逻辑
 *
 * @author wangjie
 * @date 2020/10/6 下午8:34
 */
public class Client {
    public static void main(String[] args) {
        ProductFactory.createProduct("A");
        ProductFactory.createProduct("B");
    }
}
