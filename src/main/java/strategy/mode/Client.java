package strategy.mode;

/**
 * 策略模式
 * 定义： 定义一组算法，将每一个算法封装起来，从而使他们可以互相切换
 * 特点： 一组算法，那就是不同的策略，这组算法都实现了相同的接口或者继承了相同的抽象类，所以可以互相切换
 * <p>
 * <p>
 * 优点：
 * 算法自由切换
 * 避免使用多重条件判断
 * 扩展性良好
 * <p>
 * 缺点：
 * 策略类数量增多
 * 所有策略类都需要对外暴露
 *
 * @author wangjie
 * @date 2020/10/6 下午8:05
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();


        // 结合简单工厂模式，将策略类隐藏
        Context context2 = new Context();
        context2.factory("B");
        context2.executeStrategy();

    }
}
