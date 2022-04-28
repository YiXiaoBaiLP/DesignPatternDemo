package buzz.yixiaobai.commandpattern.demo02;

/**
 * 通用Receiver类（接收者可能有多个，所以抽象一层出来）
 * @author yixiaobai
 * @create 2022/04/28 下午4:29
 */
public abstract class Receiver {

    /**
     * 抽象接收者，定义每个接收者都必须完成的业务
     */
    public abstract void doSomething();
}
