package agency.model;

/**
 * Proxy
 *
 * @author wangjie
 * @date 2020/10/6 下午6:00
 */
public class Shop implements Sell {
    private Sell sell;

    public Shop(Sell sell) {
        this.sell = sell;
    }

    @Override
    public void sell() {
        System.out.println("代理类Shop，处理sell");
        sell.sell();
    }

    @Override
    public void ad() {
        System.out.println("代理类Shop，处理ad");
        sell.ad();
    }
}
