package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 产品等级为2的实现类
 * @author yixiaobai
 * @create 2022/04/18 下午6:41
 */
public class Creator2 extends AbstractCreator{

    /**
     * 只生产产品等级为2的A产品
     * @return
     */
    @Override
    public AbstractProductA abstractProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     * @return
     */
    @Override
    public AbstractProductB abstractProductB() {
        return new ProductB2();
    }
}
