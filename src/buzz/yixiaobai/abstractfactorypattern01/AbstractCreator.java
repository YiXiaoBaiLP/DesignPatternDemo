package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 抽象工厂类-定义每个工厂要实现的功能
 * @author yixiaobai
 * @create 2022/04/18 下午6:31
 */
public abstract class AbstractCreator {

    /**
     * 创建A产品家族
     * @return
     */
    public abstract AbstractProductA abstractProductA();

    /**
     * 创建B产品家族
     * @return
     */
    public abstract AbstractProductB abstractProductB();

    /**
     * 这里可能有N个抽象工厂类
     */
}
