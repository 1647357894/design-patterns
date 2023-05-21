package visitor.mode;

/**
 * 具体元素 车轮
 * 具体元素实现了accept()方法，在accept()方法中调用访问者的访问方法以便完成对一个元素的操作。
 *
 * @author wangjie
 * @date 2020/10/5 下午9:07
 */
public class Wheel implements Element {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}
