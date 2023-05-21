package interpreter.mode;

/**
 * 终结表达式：变量
 *实现和文法中的元素相关联的解释操作，通常一个解释器模式中只有一个终结符表达式，但有多个实例，
 * 对应不同的终结符。终结符一般是文法中的运算单元，比如 R=R1+R2,在这里面R1和R2就是终结符
 * @author wangjie
 * @date 2020/10/5 下午7:55
 */
public class Variable extends AbstractExpression {
    private final String key;

    public Variable(String key) {
        this.key = key;
    }


    @Override
    public int interpret(Context context) {
        return context.getValue(key);
    }
}
