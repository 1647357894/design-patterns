package state.mode;

public class ConcreteStateB extends State {


    @Override
    void handler(Context context) {
        context.setState(new ConcreteStateC());
    }
}



