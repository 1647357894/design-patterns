package interpreter.mode;

/**
 * 非终结表达式：加法
 * 文法中的每条规则对应于一个非终结符表达式，非终结符表达式一般是文法中的运算符或其他关键字，
 * 比如 R=R1+R2，+就是非终结符，解释+的解释器就是一个非终结符表达式。
 * @author wangjie
 * @date 2020/10/5 下午7:54
 */
public class Add extends AbstractExpression {
    private final AbstractExpression left;
    private final AbstractExpression right;

    public Add(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
