package command.mode;

/**
 * 命令模式
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户端进行参数化;对请求排队或记录请求日志，可以提供命令的撤销和恢复功能。
 * 命令模式的核心在于引入了命令类，通过命令类来降低发送者和接受者的耦合度，请求发送者只需要指定一个命令对象，再通过命令对象来调用请求接受者的处理方法。
 * 命令模式可以将请求发送者和接收者完全解偶，发送者和接收者之间没有直接引用关系，发生请求的对象只需要知道如何发送请求，而不必知道如何完成请求。
 *
 * @author wangjie
 * @date 2020/10/4 下午11:49
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver1 = new ConcreteReceiver();
        Command command1 = new ConcreteCommand(receiver1);

        Invoker invoker = new Invoker(command1);
        invoker.call();

        Receiver receiver2 = new ConcreteReceiver2();
        Command command2 = new ConcreteCommand(receiver2);

        invoker.setCommand(command2);
        invoker.call();


    }
}
