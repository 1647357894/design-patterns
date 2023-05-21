package template.method.pattern;

/**
 * 抽象模板角色：定义一组基本方法供子类实现，定义并实现组合了基本方法的模板方法
 *
 * @author wangjie
 * @date 2020/10/6 下午6:24
 */
public abstract class AbstractClass {
    protected boolean isNeedUnlock = true;// 默认需要开锁

    /**
     * 基本方法，子类需实现
     */
    protected abstract void unlock();

    /**
     * 基本方法，子类需实现
     */
    protected abstract void ride();

    /**
     * 钩子方法，子类可实现
     *
     * @param isNeedUnlock
     */
    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }

    /**
     * 模板方法，负责调度基本方法,子类不可实现
     */
    public final void use() {
        if (isNeedUnlock) {
            unlock();
        } else {
            System.out.println("锁坏了,不用解锁...");
        }
        ride();
    }
}
