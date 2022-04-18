package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 抽象的产品类B
 * @author yixiaobai
 * @create 2022/04/18 下午6:27
 */
public abstract class AbstractProductB {

    /**
     * 每个产品共有的方法
     */
    public void shareMethod(){

    }

    /**
      * 每个产品相同方法，不同实现
     */
    public abstract void doSomething();
}
