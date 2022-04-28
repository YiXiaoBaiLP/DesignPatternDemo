package buzz.yixiaobai.commandpattern.demo02;

/**
 * 命令模式-场景类
 * @author yixiaobai
 * @create 2022/04/28 下午5:24
 */
public class Client {
    public static void main(String[] args){
        // 首先声明调用者 Invoker
        Invoker invoker = new Invoker();
        // 定义接收者
        Receiver receiver = new ConcreteReceiver1();
        // 定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
        // 把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
