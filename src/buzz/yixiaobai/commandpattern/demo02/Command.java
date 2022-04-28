package buzz.yixiaobai.commandpattern.demo02;

/**
 * 抽象的Command类
 * @author yixiaobai
 * @create 2022/04/28 下午5:11
 */
public abstract class Command {

    /**
     * 每个命令类必须有一个执行命令
     */
    public abstract void execute();
}
