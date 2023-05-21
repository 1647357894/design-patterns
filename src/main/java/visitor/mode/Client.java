package visitor.mode;

/**
 * 访问者模式
 * 访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这些操作的数据结构则可以保持不变
 *
 * @author wangjie
 * @date 2020/10/5 下午8:33
 */
public class Client {
    public static void main(String[] args) {
        ElementStructure elementStructure = new ElementStructure();

        elementStructure.addElement(new Wheel("front left"));
        elementStructure.addElement(new Wheel("front right"));

        elementStructure.addElement(new Body());

        elementStructure.accept(new DoElementVisitor());
    }
}
