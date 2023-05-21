package command.mode;

public class ConcreteReceiver2 extends Receiver {

    @Override
    public void action() {
        System.out.println("ConcreteReceiver2 receiver the command!");
    }
}
