package buzz.yixiaobai.commandpattern.demo01;

/**
 * 命令模式-具体的执行操作
 * @author yixiaobai
 * @create 2022/04/27 下午2:58
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开了");
    }

    public void off(){
        System.out.println("电灯关闭了");
    }
}
