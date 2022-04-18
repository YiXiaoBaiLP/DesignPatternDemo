package buzz.yixiaobai.bridgepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/18 下午3:19
 */
public class MeiZuBrand implements Brand{
    @Override
    public void open() {
        System.out.println(" 魅族手机开机了！ ");
    }

    @Override
    public void close() {
        System.out.println(" 魅族手机关机了！ ");
    }

    @Override
    public void call() {
        System.out.println(" 魅族手机打电话！ ");
    }
}
