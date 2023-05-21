package mediator.pattern;

/**
 * 抽象中介者
 *
 * @author wangjie
 * @date 2020/10/5 下午3:25
 */
public abstract class Mediator {
    /**
     * 发送消息方法
     *
     * @param message 消息
     * @param colleague 同事对象
     */
    public abstract void send(String message, Colleague colleague);
}
