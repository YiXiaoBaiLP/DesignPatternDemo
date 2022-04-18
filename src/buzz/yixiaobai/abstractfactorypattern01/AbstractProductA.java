package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 抽象的产品类A
 * @author yixiaobai
 * @create 2022/04/18 下午6:26
 */
public abstract class AbstractProductA {

    /**
     * 每个产品都有公有的方法
     */
    public void shareMethod(){

    }

    /**
     * 每个产品相同的方法，不同实现
     */
    public abstract void doSomething();
}
