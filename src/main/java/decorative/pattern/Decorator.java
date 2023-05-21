package decorative.pattern;

/**
 * 抽象装饰者： 持有对具体组件角色的引用并定义与抽象组件角色一致的接口
 *
 * @author wangjie
 * @date 2020/10/6 下午9:27
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
