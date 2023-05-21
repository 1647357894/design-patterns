package visitor.mode;

/**
 * 抽象访问者
 * 抽象访问者为对象结构中的每一个具体元素类声明一个访问操作，从这个操作的名称或参数类型就可以清楚知道需要访问的具体元素的类型，
 * 具体访问者需要实现这些操作方法，定义对这些数据的访问操作。
 *
 * @author wangjie
 * @date 2020/10/5 下午9:07
 */
public interface ElementVisitor {
    void visit(Wheel wheel);

    void visit(Body body);
}
