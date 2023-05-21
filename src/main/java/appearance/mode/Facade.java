package appearance.mode;

/**
 * @author wangjie
 * @date 2020/10/8 下午2:35
 */
public class Facade {
    public void wrapOperation() {
        SystemA systemA = new SystemA();
        systemA.operationA();
        SystemB systemB = new SystemB();
        systemB.operationB();
    }
}
