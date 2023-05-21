package interpreter.mode;

/**
 * 抽象解释器
 * 声明一个所有具体表达式都要实现的抽象接口（或抽象类），接口中主要是interpret方法，称为解释操作。具体解释任务由它的各个实现类来完成，
 * 具体的解释器分别由终结符解释器TerminalExpression和非终结符解释器NonTerminalExpression完成。
 *
 * @author wangjie
 * @date 2020/10/5 下午7:53
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
