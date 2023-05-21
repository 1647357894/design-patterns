package visitor.mode;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * 对象结构是一个元素的集合，它用于存放元素对象，并且提供了遍历其内部元素的方法。它可以结合组合模式来实现，也可以是一个简单的集合对象，如List
 *
 * @author wangjie
 * @date 2020/10/5 下午9:11
 */
public class ElementStructure {
    private List<Element> list = new ArrayList<>();

    public void addElement(Element element) {
        list.add(element);
    }

    public void accept(ElementVisitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }
}
