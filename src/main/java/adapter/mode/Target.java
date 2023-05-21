package adapter.mode;

/**
 * 客户端所期待的接口。目标可以是具体的类或抽象的类，也可以是接口。
 *
 * @author wangjie
 * @date 2020/10/4 下午12:34
 */
public class Target {
    public void request() {
        System.out.println("普通请求");
    }
}
