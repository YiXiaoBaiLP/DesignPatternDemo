package buzz.yixiaobai.commandpattern.demo01;

/**
 * 打开电视机的操作
 * @author yixiaobai
 * @create 2022/04/27 下午3:37
 */
public class TVOnCommand implements Command{

    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    /**
     * 打开电视
     */
    @Override
    public void execute() {
        tvReceiver.on();
    }

    /**
     * 撤销操作
     */
    @Override
    public void undo() {
        tvReceiver.off();
    }
}
