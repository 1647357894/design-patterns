package builder.mode;

/**
 * 产品类
 *
 * @author wangjie
 * @date 2020/10/8 下午3:54
 */
public class Product {
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
