package chain.responsibility.model;

/**
 * @author wangjie
 * @date 2020/10/5 下午2:27
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        //处理请求
        if (request < 20) {
            System.out.println("ConcreteHandler2 process");
        } else if (successor != null) {
            //将请求转到下一位
            successor.handlerRequest(request);
        }

    }
}

