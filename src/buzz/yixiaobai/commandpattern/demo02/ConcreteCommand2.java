package buzz.yixiaobai.commandpattern.demo02;

/**
 * 具体的 Command 类
 * @author yixiaobai
 * @create 2022/04/28 下午5:14
 */
public class ConcreteCommand2 extends Command{

    // 对哪个 Receiver 类进行命令处理
    private Receiver receiver;

    /**
     * 构造函数传递接收者
     * @param receiver
     */
    public ConcreteCommand2(Receiver receiver){
        this.receiver = receiver;
    }

    /**
     * 必须实现一个命令
     */
    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
