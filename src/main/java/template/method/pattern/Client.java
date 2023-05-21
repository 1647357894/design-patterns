package template.method.pattern;

/**
 * 模板方法模式
 * 定义抽象类并且声明一些抽象基本方法供子类实现不同逻辑，同时在抽象类中定义具体方法把抽象基本方法封装起来，这就是模板方法模式。
 *
 *
 *
 * @author wangjie
 * @date 2020/10/6 下午6:13
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass scanBicycle = new ScanBicycle();
        scanBicycle.use();
    }
}
