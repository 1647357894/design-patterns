package builder.mode;

/**
 * 具体建造者
 *
 * @author wangjie
 * @date 2020/10/8 下午3:55
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setName("001");
    }

    @Override
    public void buildPart2() {
        product.setAge("18");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
