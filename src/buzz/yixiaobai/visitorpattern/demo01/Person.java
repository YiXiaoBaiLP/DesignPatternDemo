package buzz.yixiaobai.visitorpattern.demo01;

/**
 * @author yixiaobai
 * @create 2022/04/27 下午7:35
 */
public abstract class Person {

    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
