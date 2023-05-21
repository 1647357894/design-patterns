package strategy.mode;

/**
 * 环境类
 * 起承上启下封装作用，屏蔽高层模块对策略算法的直接访问，封装可能存在的变化
 *
 * @author wangjie
 * @date 2020/10/6 下午8:11
 */
public class Context {
    /**
     * 抽象策略
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context( ) {
    }
    /**
     * 封装后的策略方法
     */
    public void executeStrategy() {
        strategy.doSomething();
    }


    public void factory(String strategyType){
        if ("A".equals(strategyType)) {
            this.strategy = new ConcreteStrategyA();
        } else if ("B".equals(strategyType)) {
            this.strategy = new ConcreteStrategyB();
        }
    }
}
