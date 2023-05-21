package decorative.pattern;

/**
 * 装饰者模式
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，Decorative模式相比生成子类更灵活。该模式以对客户端透明的方式扩展对象的功能。
 *
 * @author wangjie
 * @date 2020/10/6 下午9:22
 */
public class Client {
    public static void main(String[] args) {
        ConcreteDecorator decorator = new ConcreteDecorator(new ConcreteComponent());
        decorator.method();
    }
}
