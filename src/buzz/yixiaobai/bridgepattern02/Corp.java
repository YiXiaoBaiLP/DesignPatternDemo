package buzz.yixiaobai.bridgepattern02;

/**
 * 抽象公司类
 * @author yixiaobai
 * @create 2022/04/18 下午3:24
 */
public abstract class Corp {
    // 定义一个抽象的产品类，不知道具体的产品
    private Product product;

    // 构造函数，由子类定义传递具体的抽象产品
    public Corp(Product product){
        this.product = product;
    }

    public void makeMonkey(){
        // 先生产
        this.product.beProducted();
        // 然后销售
        this.product.beSelled();
    }
}
