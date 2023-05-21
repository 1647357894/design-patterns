package prototype.mode;

/**
 * 具体原型角色
 *
 */
public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone2() {
        Prototype prototype = new ConcretePrototype1(this.getId());
        return prototype;
    }

} 