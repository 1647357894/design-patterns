package flyweight.model;

/** 享元接口
 * @author wangjie
 * @date 2020/10/5 下午4:42
 */
public interface Flyweight {


    /**
     * 外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象
     *
     * @param extrinsicState
     */
     void operation(String extrinsicState);
}
