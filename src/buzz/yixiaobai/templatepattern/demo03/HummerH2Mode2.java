package buzz.yixiaobai.templatepattern.demo03;

/**
 * 扩展后的子类2
 * @author yixiaobai
 * @create 2022/04/26 下午4:28
 */
public class HummerH2Mode2 extends HummerMode1{
    @Override
    protected void start() {
        System.out.println("悍马H2启动。。。");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声。。。");
    }

    // 默认没有喇叭
    @Override
    protected boolean isAlarm(){
        return false;
    }
}
