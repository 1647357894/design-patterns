package command.mode;

/**
 * 接收者角色
 * 命令接收者模式，命令传递到这里执行对应的操作
 *
 * @author wangjie
 * @date 2020/10/5 下午1:28
 */
public abstract class Receiver {
    public abstract void action();
}
