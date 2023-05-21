package memo.mode;

/**
 * 备忘录模式
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 *
 * @author wangjie
 * @date 2020/10/4 下午1:07
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        //设置初始状态
        originator.setState("on");
        originator.show();

        //保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节。
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);


        //改变状态
        originator.setState("off");
        originator.show();

        //恢复状态
        originator.setMemento(caretaker.getMemento());

        originator.show();

    }
}
