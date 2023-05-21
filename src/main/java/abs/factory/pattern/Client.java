
package abs.factory.pattern;

/**
 * 抽象工厂模式
 * 提供创建一个一系列相关的或互相依赖对象的接口，而无需指定它们具体的类。
 * 优点
 * 易于交换产品系列，由于具体工厂类 例如 AbstractFactory abstractFactory = new ConcreteFactory1();只需要初始化一次，
 * 使得改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂，即可使用不同的产品配置。
 * <p>
 * 缺点
 * 对扩展不友好，需要增加一个新的产品，就需要在抽象工厂中加入创建i新产品的方法。还要增加新产品抽象类和具体实现类。
 *
 * @author wangjie
 * @date 2020/9/29 下午9:55
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        productA.sayHello();


        AbstractFactory abstractFactory2 = new ConcreteFactory2();
        AbstractProductA productA2 = abstractFactory2.createProductA();
        productA2.sayHello();


    }
}
