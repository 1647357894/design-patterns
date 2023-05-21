package chain.responsibility.model;

/**
 * 职责链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * @author wangjie
 * @date 2020/10/5 下午1:49
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {8,15,25,9};
        for (int request : requests) {
            h1.handlerRequest(request);
        }
    }
}
