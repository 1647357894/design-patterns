package mediator.pattern;

/**
 * 具体同事类
 *
 * @author wangjie
 * @date 2020/10/5 下午3:28
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void call(String message) {
        System.out.println("同事2得到消息:" + message);
    }
}
