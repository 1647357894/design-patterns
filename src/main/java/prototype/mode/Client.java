package prototype.mode;

/**
 * 原型模式
 * 属于对象的创建模式，通过给出一个原型对象来指明所有创建的对象的类型，然后用这个原型对象提供的复制方法创建出更多同类型的对象。
 *
 * @author wangjie
 * @date 2020/10/6 下午10:17
 */
public class Client {
    public static void main(String[] args) {
     Prototype  a = new ConcretePrototype1("a");
        Prototype a2 = a.clone2();
        System.out.println(a);
        System.out.println(a2);
    }
}
