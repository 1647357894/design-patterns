package command.mode;

/**
 * 具体接受者
 *
 * @author wangjie
 * @date 2020/10/5 下午1:31
 */
public class ConcreteReceiver extends Receiver {

    @Override
    public void action() {
        System.out.println("ConcreteReceiver receiver the command!");
    }
}

