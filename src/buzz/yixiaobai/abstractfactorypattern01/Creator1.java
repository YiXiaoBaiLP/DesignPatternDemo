package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 产品等级1的实现类
 * @author yixiaobai
 * @create 2022/04/18 下午6:38
 */
public class Creator1 extends AbstractCreator{

    /**
     * 只生产产品等级为1的A产品
     * @return
     */
    @Override
    public AbstractProductA abstractProductA() {
        return new ProductA1();
    }

    /**
     * 只生产产品登记为1的B产品
     * @return
     */
    @Override
    public AbstractProductB abstractProductB() {
        return new ProductB1();
    }
}
