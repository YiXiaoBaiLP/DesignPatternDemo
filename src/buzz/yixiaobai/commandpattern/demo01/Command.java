package buzz.yixiaobai.commandpattern.demo01;

/**
 * 命令模式-创建命令接口
 * @author yixiaobai
 * @create 2022/04/27 下午2:50
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销某个命令
     */
    void undo();
}
