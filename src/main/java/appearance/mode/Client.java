package appearance.mode;

/**
 * 外观模式
 * 外部与一个子系统的通信必须通过一个统一的外观对象进行，为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * <p>
 * Facade：外观角色
 * SubSystem：子系统角色
 * <p>
 * 优点：
 * 对客户端屏蔽子系统组件，减少了客户处理的对象数目并使得子系统使用起来更容易。通过引入外观模式，客户代码将变得很简单，与之关联对象也很少。
 *
 * 缺点:
 *  不能很好地限制客户使用子系统类，如果对客户访问子系统类做太多的限制则减少了可变性和灵活性。
 *
 * @author wangjie
 * @date 2020/10/6 下午10:24
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.wrapOperation();
    }
}
