package visitor.mode;

/**
 * @author wangjie
 * @date 2020/10/5 下午9:23
 */
public class Body implements Element {

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}
