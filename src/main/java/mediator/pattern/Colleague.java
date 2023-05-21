package mediator.pattern;

/**
 * 抽象同事类
 *
 * @author wangjie
 * @date 2020/10/5 下午3:26
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
