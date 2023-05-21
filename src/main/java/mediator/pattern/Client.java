package mediator.pattern;

/**
 * 中介者模式
 * 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地互相引用，从而使得耦合松散，而且可以独立地改变它们之间的交互
 *
 * @author wangjie
 * @date 2020/10/5 下午3:10
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        //给同事类设置中介者对象
        ConcreteColleague1 c1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(concreteMediator);

        //给中介者设置同事对象
        concreteMediator.setColleague1(c1);
        concreteMediator.setColleague2(c2);

        //具体同事类发送消息都是通过中介者转发
        c1.send("hello");
        c2.send("world");

    }
}
