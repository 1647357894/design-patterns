package decorative.pattern;

/**
 * 被装饰者
 * 具体组件：将要被附加新功能的类
 * ，实现抽象组件角色接口
 *
 * @author wangjie
 * @date 2020/10/6 下午9:26
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("被装饰类实现的方法");
    }
}
