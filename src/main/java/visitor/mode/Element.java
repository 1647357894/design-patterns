package visitor.mode;

/**
 * 抽象元素
 * 抽象元素一般是抽象类或接口，定义一个accept()方法，该方法通常以一个抽象访问者作为参数。
 * @author wangjie
 * @date 2020/10/5 下午9:06
 */
public interface Element {
    void accept(ElementVisitor visitor);
}
