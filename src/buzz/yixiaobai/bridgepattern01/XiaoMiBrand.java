package buzz.yixiaobai.bridgepattern01;

/**
 * 小米手机实现Brand类
 * @author yixiaobai
 * @create 2022/04/18 下午2:42
 */
public class XiaoMiBrand implements Brand{
    @Override
    public void open() {
        System.out.println(" XiaoMi手机开机了！ ");
    }

    @Override
    public void close() {
        System.out.println(" XiaoMi手机关机了！ ");
    }

    @Override
    public void call() {
        System.out.println(" XiaoMi手机打电话！ ");
    }
}
