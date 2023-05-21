package memo.mode;

/**
 * 管理者：
 * 负责保存备忘录Memento，不能对备忘录内容进行操作或检查。
 *
 * @author wangjie
 * @date 2020/10/4 下午2:07
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
