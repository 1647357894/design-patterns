package visitor.mode;

/**
 * 具体访问者
 * 具体访问者实现了每个抽象访问者的声明的操作，每一个操作用于访问对象结构中的一种类型的元素。
 *
 * @author wangjie
 * @date 2020/10/5 下午9:09
 */
public class DoElementVisitor implements ElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }
}
