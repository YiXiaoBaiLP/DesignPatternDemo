package buzz.yixiaobai.visitorpattern.demo03;

/**
 * 抽象元素
 * @author yixiaobai
 * @create 2022/04/29 上午3:15
 */
public abstract class Element {
    /*
    抽象元素有两类方法：
        1、本身的业务逻辑，也就是元素作为一个业务处理单元必须完成的职责
        2、允许哪一个访问者来访问
     */

    // 定义业务逻辑
    public abstract void doSomething();
    // 允许谁来访问
    public abstract void accept(IVisitor iVisitor);
}
