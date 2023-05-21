package builder.mode;

/**
 * 导演者
 *
 * @author wangjie
 * @date 2020/10/8 下午3:57
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }

}
