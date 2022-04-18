package buzz.yixiaobai.bridgepattern02;

/**
 * IPod产品类
 * @author yixiaobai
 * @create 2022/04/18 下午3:41
 */
public class IPodProduct extends Product{
    @Override
    public void beProducted() {
        System.out.println("生产出来的IPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的IPod都卖出去了...");
    }
}
