package bridge.mode;

/**
 * 具体实现类
 *
 * @author wangjie
 * @date 2020/10/4 下午9:49
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    void operation() {
        System.out.println("具体的A实现");
    }
}
