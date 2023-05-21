package interpreter.mode;

/**
 * 解释器模式，给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 *
 * @author wangjie
 * @date 2020/10/5 下午7:08
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.addValue("a",1);
        context.addValue("b",2);

        Variable a = new Variable("a");
        Variable b = new Variable("b");

        Add addVal = new Add(a, b);
        int r = addVal.interpret(context);
        System.out.println("r = " + r);
        System.out.println("context.getValueMap() = " + context.getValueMap());

    }
}
