package combination.mode;

/**
 * 组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component的子部件。
 *
 * @author wangjie
 * @date 2020/10/4 下午3:41
 */
public abstract class Component {
   abstract void add(Component c);

   abstract void remove(Component c);

   abstract void display(int depth);

   protected String name;

    public Component(String name) {
        this.name = name;
    }
    protected String fill(int depth){
        StringBuilder sb = new StringBuilder("-");
        for (int i = 1; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
