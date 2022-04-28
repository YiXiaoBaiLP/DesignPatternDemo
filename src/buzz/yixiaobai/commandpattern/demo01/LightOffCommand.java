package buzz.yixiaobai.commandpattern.demo01;

/**
 * @author yixiaobai
 * @create 2022/04/27 下午3:02
 */
public class LightOffCommand implements Command {

    private LightReceiver lightReceiver;

    /**
     * 构造函数
     * @param lightReceiver
     */
    public LightOffCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }
    /**
     * 执行打开操作
     */
    @Override
    public void execute() {
        lightReceiver.off();
    }

    /**
     * 撤销
     */
    @Override
    public void undo() {
        lightReceiver.on();
    }

}
