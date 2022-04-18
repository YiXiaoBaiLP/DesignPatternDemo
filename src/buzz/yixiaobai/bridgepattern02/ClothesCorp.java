package buzz.yixiaobai.bridgepattern02;

/**
 * 服装公司
 * @author yixiaobai
 * @create 2022/04/18 下午4:00
 */
public class ClothesCorp extends Corp{

    public ClothesCorp(Product product) {
        super(product);
    }

    public void makeMonkey(){
        super.makeMonkey();
        System.out.println("服装公司赚小对方钱...");
    }
}
