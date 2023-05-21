package memo.mode;

/**
 * 备忘录
 * 负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento。
 * 备忘录
 *
 * @author wangjie
 * @date 2020/10/4 下午2:05
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
