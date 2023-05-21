package state.mode;

/**
 * @author wangjie
 * @date 2020/10/3 下午2:48
 */
public class ConcreteStateA extends State {


    @Override
    void handler(Context context) {
        //设置ConcreteStateA下一个状态是B
        context.setState(new ConcreteStateB());
    }
}


