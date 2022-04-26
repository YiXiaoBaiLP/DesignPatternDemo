package buzz.yixiaobai.templatepattern.demo03;

/**
 * 扩展后的子类1
 * @author yixiaobai
 * @create 2022/04/26 下午4:22
 */
public class HummerH1Mode1 extends HummerMode1{
    // 需要鸣笛
    private boolean alarmFlag = true;

    /**
     * 启动
     */
    @Override
    protected void start() {
        System.out.println("悍马H1发动。。。");
    }

    /**
     * 停止
     */
    @Override
    protected void stop() {
        System.out.println("悍马H1停止。。。");
    }

    /**
     * 鸣笛
     */
    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛。。。");
    }

    /**
     * 引擎声
     */
    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声。。。");
    }

    @Override
    protected boolean isAlarm(){
       return this.alarmFlag;
    }
    /**
     * 要不要鸣笛，用户自己控制
     * @param alarmFlag
     */
    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }
}
