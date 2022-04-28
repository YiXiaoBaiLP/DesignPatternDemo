package buzz.yixiaobai.commandpattern.demo02;

/**
 * 调用者 Invoker 类
 * @author yixiaobai
 * @create 2022/04/28 下午5:22
 */
public class Invoker {

    // 命令
    private Command command;

    /**
     * 受气包，接受命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }
}
