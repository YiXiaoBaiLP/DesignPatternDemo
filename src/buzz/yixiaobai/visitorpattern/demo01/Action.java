package buzz.yixiaobai.visitorpattern.demo01;

/**
 * @author yixiaobai
 * @create 2022/04/27 下午7:02
 */
public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
