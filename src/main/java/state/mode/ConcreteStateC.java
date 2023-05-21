package state.mode;

public class ConcreteStateC extends State {


    @Override
    void handler(Context context) {
        context.setState(new ConcreteStateA());
    }
}