package adapter.mode;

/**
 * 适配器模式
 * 将一个类的接口转换成客户希望的另一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * <p>
 * 使用场景
 * 使用第三方组件开发时，而这个组件的接口与我们自己的系统的接口是不相同的，而我们也没有必要更改自己的接口，可以使用适配器模式来解决接口不同的问题。
 *
 * @author wangjie
 * @date 2020/10/4 下午12:33
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
