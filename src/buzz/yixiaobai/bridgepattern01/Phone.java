package buzz.yixiaobai.bridgepattern01;

/**
 * 手机抽象类
 * @author yixiaobai
 * @create 2022/04/18 下午2:34
 */
public abstract class Phone {

    // 将品牌组合进来
    private Brand brand;
    // 构造函数中初始化品牌
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }
    // 开机
    protected void open(){
        this.brand.open();
    }
    // 关机
    protected void close(){
        this.brand.close();
    }
    // 打电话
    protected void call(){
        this.brand.call();
    }
}
