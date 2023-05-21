package agency.model;

/**
 * RealSubject
 *
 * @author wangjie
 * @date 2020/10/6 下午5:59
 */
public class Vendor implements Sell {
    @Override
    public void sell() {
        System.out.println("Shop sell goods");
    }

    @Override
    public void ad() {
        System.out.println("Shop advert goods");
    }

}
