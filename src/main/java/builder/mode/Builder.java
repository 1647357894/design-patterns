package builder.mode;

/**
 * 抽象建造者
 *
 * @author wangjie
 * @date 2020/10/8 下午3:54
 */
public interface Builder {
    void buildPart1();
    void buildPart2();

    Product retrieveResult();
}
