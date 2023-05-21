package decorative.pattern;

/**
 * 具体装饰
 * 实现抽象装饰者角色，负责对具体组件添加额外功能
 *
 * @author wangjie
 * @date 2020/10/6 下午9:31
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void method() {
        super.method();
        reMethod();
    }

    private void reMethod() {
        System.out.println("增强的方法");
    }
}
