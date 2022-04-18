package buzz.yixiaobai.factorypattern01;

/**
 * @author yixiaobai
 * @create 2022/04/18 下午4:13
 */
public abstract class AbstractHumanFactory {

    /**
     *   抽象方法
     *   使用了泛型，对传入的对象进行限制
     * @param c 类型必须为Class
     * @param <T> 参数必须实现Human接口
     * @return
     */
    public abstract <T extends Human> Human createHuman(Class<T> c);
}
