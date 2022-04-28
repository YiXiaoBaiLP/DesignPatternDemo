package buzz.yixiaobai.commandpattern.demo01;

import buzz.yixiaobai.commandpattern.Command;

/**
 *
 * @author yixiaobai
 * @create 2022/04/27 下午2:57
 */
public class LightCommand implements Command {

    private LightReceiver lightReceiver;

    /**
     * 构造函数
     * @param lightReceiver
     */
    public LightCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }
    /**
     * 执行打开操作
     */
    @Override
    public void execute() {
        lightReceiver.on();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        lightReceiver.off();
    }
}
