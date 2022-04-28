package buzz.yixiaobai.commandpattern.demo01;

/**
 * 命令模式-发布命令
 * @author yixiaobai
 * @create 2022/04/27 下午3:08
 */
public class RemoteController {

    // 开关按钮的操作
    Command[] onCommands;
    Command[] offCommands;

    // 撤销命令
    Command undoCommand;

    // 构造器，完成对象的初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];


        for(int i = 0; i < 5; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();

        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下的按钮
     * @param no
     */
    public void onButtonWasPushed(int no) {
        // 找到你按下的开的按钮，并调用对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }
    /**
     * 按下的按钮
     * @param no
     */
    public void offButtonWasPushed(int no) {
        // 找到你按下的关的按钮，并调用对应方法
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销命令
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
