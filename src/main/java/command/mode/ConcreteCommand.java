package command.mode;

/**
 * @author wangjie
 * @date 2020/10/5 下午1:28
 */
public class ConcreteCommand extends Command {
    //请求接受者引用
    private Receiver receiver;

    @Override
    public void execute() {
        //调用请求接受者的业务处理方法
        receiver.action();
    }

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
