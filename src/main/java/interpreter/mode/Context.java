package interpreter.mode;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境上下文
 * 一般存放文法中各个终结符所对应的具体值，比如R=R1+R2,赋值R1=1,R2=2。这些信息需要存放到环境角色中。
 *
 * @author wangjie
 * @date 2020/10/5 下午7:57
 */
public class Context {
    private final Map<String, Integer> valueMap = new HashMap<>();

    public void addValue(final String key, final int value) {
        valueMap.put(key, value);
    }

    public Map<String, Integer> getValueMap() {
        return valueMap;
    }

    public int getValue(final String key) {
        return valueMap.get(key);
    }
}
