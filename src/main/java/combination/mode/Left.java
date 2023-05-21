package combination.mode;


/**
 * 叶节点
 * 没有子节点
 *
 * @author wangjie
 * @date 2020/10/4 下午3:44
 */
public class Left extends Component {
    public Left(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        throw new RuntimeException("not support");
    }

    @Override
    public void remove(Component c) {
        throw new RuntimeException("not support");
    }

    @Override
    public void display(int depth) {
        System.out.println( fill(depth)+name);
    }
}
