package builder.mode;

/**
 * 建造者模式
 * 建造模式是对象的创建模式。建造模式可以将一个产品的内部表象与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象
 *
 * @author wangjie
 * @date 2020/10/8 下午3:52
 */
public class Client {
    public static void main(String[] args) {
        //创建具体建造者对象
        Builder builder = new ConcreteBuilder();
        //创建导演者角色，给定建造者对象
        Director director = new Director(builder);
        //调用导演者角色，创建产品零件
        director.construct();
        //接受建造者角色产品建造结果
        Product product = builder.retrieveResult();
        System.out.println("product = " + product);
    }
}
