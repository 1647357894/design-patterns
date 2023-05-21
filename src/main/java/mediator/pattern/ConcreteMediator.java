package mediator.pattern;

/**
 * 具体中介者
 *
 * @author wangjie
 * @date 2020/10/5 下午3:27
 */
public class ConcreteMediator extends Mediator {
    //具体同事对象
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        //重写发送消息方法，根据对象做出判断
        if (colleague == colleague1) {
            //other service do something
            colleague1.call(message);
        } else if (colleague == colleague2) {
            colleague2.call(message);
        }
    }
}
