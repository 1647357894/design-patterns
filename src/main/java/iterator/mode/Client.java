package iterator.mode;

/**
 * 迭代器模式，提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示
 * 分离了集合对象的遍历行为，抽象出一个迭代类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的和数据。
 *
 * @author wangjie
 * @date 2020/10/4 下午4:57
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<Integer>();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        Iterator<Integer> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
