package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 产品A1的实现类
 * @author yixiaobai
 * @create 2022/04/18 下午6:35
 */
public class ProductA1 extends AbstractProductA{

    @Override
    public void doSomething() {
        System.out.println("产品A1的实现方法");
    }
}
