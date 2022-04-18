package buzz.yixiaobai.bridgepattern02;

/**
 * iPhone公司
 * @author yixiaobai
 * @create 2022/04/18 下午3:51
 */
public class IPodCorp extends Corp{

    public IPodCorp(Product product) {
        super(product);
    }

    public void makeMonkey(){
        super.makeMonkey();
        System.out.println("山寨平板电脑，利润很高...");
    }
}
