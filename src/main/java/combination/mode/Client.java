package combination.mode;

/**
 * 组合模式
 * 将对象组合成树形结构以表示‘部分-整体’的结构层次。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * <p>
 * 使用场景
 * 需求中体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一的使用组合结构中所有的对象时。
 *
 * @author wangjie
 * @date 2020/10/4 下午3:17
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Left("Left A"));
        root.add(new Left("Left B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Left("Left XA"));
        comp.add(new Left("Left XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Left("Left XYA"));
        comp2.add(new Left("Left XYB"));
        root.add(comp2);

        root.add(new Left("Left C"));

        Left left = new Left("Left D");
        root.add(left);
        root.remove(left);

        root.display(1);
    }
}
