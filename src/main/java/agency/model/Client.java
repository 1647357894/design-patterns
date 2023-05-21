package agency.model;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用
 * 1.隐藏委托类的具体实现
 * 2.实现客户与委托类的解偶，在不改变委托类代码的情况下添加一些额外的功能（日志，权限）
 * <p>
 * 三类对象：
 * Subject（抽象主题对象）：定义代理类和真实主题的公共对外方法，也是代理类代理真实主题的方法。
 * RealSubject（真实主题角色）：真正实现业务逻辑的类。
 * Proxy（代理主题角色）： 用来代理和封装真实主题。
 * <p>
 * 静态代理。
 *
 * @author wangjie
 * @date 2020/10/5 下午1:49
 */
public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop(new Vendor());
        shop.ad();
    }
}
