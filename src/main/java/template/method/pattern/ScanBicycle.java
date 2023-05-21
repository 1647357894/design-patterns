package template.method.pattern;

/**
 * 具体模板角色：实现抽象模板角色定义的基本方法
 *
 * @author wangjie
 * @date 2020/10/6 下午6:29
 */
public class ScanBicycle extends AbstractClass {
    @Override
    protected void unlock() {
        System.out.println("扫码开锁...");
    }

    @Override
    protected void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风...");
    }
}
