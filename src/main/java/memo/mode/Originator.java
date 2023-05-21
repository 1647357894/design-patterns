package memo.mode;

/**
 * 负责创建一个备忘录Memento，用以记录当前时刻内部状态，并可使用备忘录恢复内部状态。
 * Originator可根据需要决定Memento存储 Originator的那些状态
 *
 * @author wangjie
 * @date 2020/10/4 下午2:03
 */
public class Originator {
    //需要保存的属性...
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("state = " + state);
    }

    /**
     * 创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录，将Memento导入并将相关数据恢复
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    }
}
