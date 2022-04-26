package buzz.yixiaobai.templatepattern.demo02;

/**
 * 抽象模版类
 * @author yixiaobai
 * @create 2022/04/26 下午3:53
 */
public abstract class AbstractClass {
    // 基本方法
    protected abstract void doSomething();
    // 基本方法
    protected abstract void doAnything();
    // 模版方法
    public final void templateMethod(){
        /*
         * 调用基本方法，完成相关逻辑
         */
        this.doSomething();
        this.doAnything();
    }
}
