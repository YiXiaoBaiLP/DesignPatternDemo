package buzz.yixiaobai.flyweightpattern.demo04;

/**
 * 具体享元角色
 * @author yixiaobai
 * @create 2022/04/21 下午7:39
 */
public class ConcreteFlyweight2 extends Flyweight{
    // 接受外部状态
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }
    // 根据外部状态进行逻辑处理
    @Override
    public void operate() {
        // 业务逻辑
    }
}
