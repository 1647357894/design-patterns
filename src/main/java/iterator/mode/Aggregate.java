package iterator.mode;

/**
 * 容器定义
 *
 * @author wangjie
 * @date 2020/10/4 下午5:10
 */
public interface Aggregate<T> {
     Iterator<T> iterator();
    void add(T t);
}
