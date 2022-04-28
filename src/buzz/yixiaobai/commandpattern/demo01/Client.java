package buzz.yixiaobai.commandpattern.demo01;

/**
 * 命令模式-客户端
 * @author yixiaobai
 * @create 2022/04/27 下午3:22
 */
public class Client {
    public static void main(String[] args){
        // 使用命令模式，完成通过遥控器，对电灯泡的操作

        // 创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();

        // 创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给我们的遥控器设置命令，比如 no = 0 是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("==================== 电灯操作 =============================");
        System.out.println("==================== 按下开灯的操作 ========================");
        remoteController.onButtonWasPushed(0);
        System.out.println("==================== 按下关灯的操作 ========================");
        remoteController.offButtonWasPushed(0);
        System.out.println("==================== 按下撤销操作 ==========================");
        remoteController.undoButtonWasPushed();

        System.out.println("*********************************************************");

        TVReceiver tvReceiver = new TVReceiver();
        // 创建电视的开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("==================== 电视机操作 =============================");

        System.out.println("==================== 按下关电视机的操作 ========================");
        remoteController.offButtonWasPushed(1);
        System.out.println("==================== 按下电视机的操作 ========================");
        remoteController.onButtonWasPushed(1);
        System.out.println("==================== 按下撤销操作 ==========================");
        remoteController.undoButtonWasPushed();
    }
}
