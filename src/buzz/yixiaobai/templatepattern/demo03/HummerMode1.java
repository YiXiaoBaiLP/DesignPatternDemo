package buzz.yixiaobai.templatepattern.demo03;

/**
 * 抽象方法模式-钩子方法
 * @author yixiaobai
 * @create 2022/04/26 下午4:18
 */
public abstract class HummerMode1 {

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 引擎声
     */
    protected abstract void engineBoom();

    public final void run(){
        // 启动
        this.start();
        // 引擎声
        this.engineBoom();
        // 用户自己控制是否鸣笛
        if(this.isAlarm()){
            // 鸣笛
            this.alarm();
        }
        // 停止
        this.stop();
    }

    /**
     * 钩子方法，默认鸣笛
     * @return
     */
    protected boolean isAlarm(){
        return true;
    }
}
