package state.mode;

/**
 * 维护一个ConcreteState的子类实例，状态实例
 *
 * @author wangjie
 * @date 2020/10/3 下午2:49
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handler(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.getClass().getName());
    }

}
