package buzz.yixiaobai.bridgepattern02;

/**
 * 服装产品类
 * @author yixiaobai
 * @create 2022/04/18 下午3:28
 */
public class ClothesProduct extends Product{
    @Override
    public void beProducted() {
        System.out.println("衣服生产出是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服都卖出去了...");
    }
}
