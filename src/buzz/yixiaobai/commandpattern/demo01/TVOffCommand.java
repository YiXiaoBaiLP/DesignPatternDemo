package buzz.yixiaobai.commandpattern.demo01;

/**
 *
 * 关闭电视机的操作
 * @author yixiaobai
 * @create 2022/04/27 下午3:37
 */
public class TVOffCommand implements Command{

    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }
    /**
     * 关闭电视机
     */
    @Override
    public void execute() {
        tvReceiver.off();
    }

    /**
     * 撤销操作
     */
    @Override
    public void undo() {
        tvReceiver.on();
    }
}
