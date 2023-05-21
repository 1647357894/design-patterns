package flyweight.model;

/**
 * 具体享元类
 * 实现享元接口，该类对象将被复用
 * <p>
 * name为内部状态，在构造时确定，externalState属于外部状态，由客户端在调用时传入。
 *
 * @author wangjie
 * @date 2020/10/5 下午4:48
 */
public class ConcreteFlyweight implements Flyweight {
    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(String externalState) {
        System.out.printf("name = %s  outerState=%s\n", this.name, externalState);
    }
}
