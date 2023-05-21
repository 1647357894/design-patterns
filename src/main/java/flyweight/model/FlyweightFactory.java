package flyweight.model;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂类
 * 控制实例创建和共享
 * <p>
 * 享元对象的复用完全依靠享元工厂。同时此例使用了对象创建的懒加载。并且为了保证线程安全及效率，使用了双重检查。
 *
 * @author wangjie
 * @date 2020/10/5 下午4:37
 */
public class FlyweightFactory {


    //定义一个HashMap用于存储享元对象，实现享元池
    private static ConcurrentHashMap<String, Flyweight> flyweights = new ConcurrentHashMap<>();

    public Flyweight getFlyweight(String key) {
        //对象存在，则从享元池中获取
        if (!flyweights.containsKey(key)) {
            synchronized (flyweights) {
                //不存在，创建并添加到享元池中，然后返回
                if (!flyweights.containsKey(key)) {
                    Flyweight fw = new ConcreteFlyweight(key);
                    flyweights.put(key, fw);
                }
            }
        }
        return flyweights.get(key);
    }
}
