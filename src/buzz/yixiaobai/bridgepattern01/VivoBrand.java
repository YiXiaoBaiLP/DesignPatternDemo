package buzz.yixiaobai.bridgepattern01;

/**
 * Vivo手机实现Brand接口
 * @author yixiaobai
 * @create 2022/04/18 下午2:39
 */
public class VivoBrand implements Brand{
    @Override
    public void open() {
        System.out.println(" Vivo手机开机了！ ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机了！ ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机打电话！ ");
    }
}
