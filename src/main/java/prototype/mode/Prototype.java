package prototype.mode;

/**
 * 抽象原型角色
 *
 * @author wangjie
 * @date 2020/10/6 下午10:19
 */
public abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象。
     */
    public abstract Prototype clone2();

    @Override
    public String toString() {
        return "Prototype{" +
                "id='" + id + '\'' +
                '}';
    }
}
