package chain.responsibility.model;

/**
 * 处理请求接口
 *
 * @author wangjie
 * @date 2020/10/5 下午2:24
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * 设置下一个处理者
     *
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     *
     * @param request
     */
    public abstract void handlerRequest(int request);
}
