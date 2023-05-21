package factory.method.pattern;

public class FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}