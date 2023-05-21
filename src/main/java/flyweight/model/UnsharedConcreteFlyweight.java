package flyweight.model;

/**
 * @author wangjie
 * @date 2020/10/5 下午4:51
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    private String name;

    public UnsharedConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(String externalState) {
        System.out.printf("name = %s  outerState=%s\n", this.name, externalState);
    }
}
