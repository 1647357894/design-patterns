package strategy.mode;

/** 具体策略
 * @author wangjie
 * @date 2020/10/6 下午8:10
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("策略B...");
    }
}