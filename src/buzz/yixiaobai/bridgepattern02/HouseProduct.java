package buzz.yixiaobai.bridgepattern02;

/**
 * 房子商品类
 * @author yixiaobai
 * @create 2022/04/18 下午3:44
 */
public class HouseProduct extends Product{
    @Override
    public void beProducted() {
        System.out.println("生产出来的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的房子都卖掉了...");
    }
}
