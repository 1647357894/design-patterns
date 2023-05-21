package combination.mode;

import java.util.ArrayList;
import java.util.List;

/** 有子节点，用来储存子组件
 * @author wangjie
 * @date 2020/10/4 下午3:52
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        list.add(c);
    }

    @Override
    void remove(Component c) {
        list.remove(c);
    }

    @Override
    void display(int depth) {
        System.out.println(fill(depth) + name);
        for (Component component : list) {
            component.display(depth + 2);
        }
    }
}
