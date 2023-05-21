package command.mode;

/**
 * 调用者角色
 * 接收到命令，并执行命令，也就是命令的发动者和调用者。
 *
 * @author wangjie
 * @date 2020/10/5 下午1:27
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 业务方法，用于调用命令类的execute()方法
     */
    public void call() {
        command.execute();
    }
}
