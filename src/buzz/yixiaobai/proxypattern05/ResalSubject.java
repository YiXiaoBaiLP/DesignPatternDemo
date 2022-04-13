package buzz.yixiaobai.proxypattern05;

/**
 * 真实主题
 * @author yixiaobai
 * @create 2022/04/13 下午3:48
 */
public class ResalSubject implements Subject{
    // 业务实现
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
