package buzz.yixiaobai.proxypattern05;

/**
 * 通知实现
 * @author yixiaobai
 * @create 2022/04/13 下午4:01
 */
public class BeforeAdvice implements IAdvice{
    // 通知类的实现方法
    @Override
    public void exec() {
        System.out.println("我是前置通知方法，我被执行了！");
    }
}
