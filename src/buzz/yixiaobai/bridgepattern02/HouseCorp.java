package buzz.yixiaobai.bridgepattern02;

/**
 * 房地产公司
 * @author yixiaobai
 * @create 2022/04/18 下午3:49
 */
public class HouseCorp extends Corp{
    // 定义传递一个House产品进来
    public HouseCorp(Product product) {
        super(product);
    }
    // 房地产公司很Hight了，赚钱，计算利润
    public void makeMonkey(){
        super.makeMonkey();
        System.out.println("房地产公司赚大钱...");
    }


}
