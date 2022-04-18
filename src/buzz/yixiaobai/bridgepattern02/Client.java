package buzz.yixiaobai.bridgepattern02;

/**
 * 桥接模式-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午3:53
 */
public class Client {
    public static void main(String[] args) {
        // 创建公司，将生产的产品传递进去
        Corp corp = new IPodCorp(new IPodProduct());
        corp.makeMonkey();

        // 创建房地产公司，并将商品传递进去
        Corp houseCorp = new HouseCorp(new HouseProduct());
        houseCorp.makeMonkey();

        // 创建服装公司
        Corp clothesCorp = new ClothesCorp(new ClothesProduct());
        clothesCorp.makeMonkey();
    }
}
