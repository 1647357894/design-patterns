package factory.method.pattern;

/**
 * 工厂方法模式
 * 定义：又称工厂模式，多态工厂模式，通过定义工厂父类负责定义创建对象的公共接口，而子类则负责生成具体的对象。
 * 主要作用：将类的实例化延迟到工厂类的子类中完成，即由子类决定创建哪一个类
 * <p>
 * 优点：
 * 符合开闭原则， 新增产品时，只需要增加相应的具体产品类和相应的工厂子类
 * 单一原则，每个工厂只负责创建对应的产品
 * 缺点：
 * 一个具体工厂只能创建一种产品
 * 添加新产品时，要添加具体工厂类，产品类，系统类的个数成对增加
 *
 * @author wangjie
 * @date 2020/10/6 下午8:48
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        Product productA = factoryA.Manufacture();
        Product productB = factoryB.Manufacture();

        productA.show();
        productB.show();

    }
}
