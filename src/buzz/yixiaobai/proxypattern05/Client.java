package buzz.yixiaobai.proxypattern05;

import java.lang.reflect.InvocationHandler;

/**
 * 动态代理的场景类
 * @author yixiaobai
 * @create 2022/04/13 下午4:03
 */
public class Client {
    public static void main(String[] args) {
    // 定义一个主题
    Subject subject = new ResalSubject();
    // 定义一个Handler
    InvocationHandler handler = new MyInvocationHandler(subject);
    // 定义一个主题的代理
    // subject.getClass().getInterfaces()：查找该类的所有接口，然后实现接口的所有方法（默认都是空）。
    Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
            subject.getClass().getInterfaces(), handler);
    // 代理的行为
    proxy.doSomething("Finish");
    }
}
